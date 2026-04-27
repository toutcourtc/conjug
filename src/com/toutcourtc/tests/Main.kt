package com.toutcourtc.tests


import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.toutcourtc.tests.managers.FileManager.Companion.getFile
import com.toutcourtc.tests.managers.StringManager.Companion.triFr
import com.toutcourtc.tests.verbes.AppelerJeter.Companion.appelerJeter
import com.toutcourtc.tests.verbes.Infinitifs1.Companion.infinitifs1
import com.toutcourtc.tests.verbes.Infinitifs2.Companion.infinitifs2
import com.toutcourtc.tests.verbes.Infinitifs3.Companion.infinitifs3
import com.toutcourtc.tests.verbes.Infinitifs4.Companion.infinitifs4
import com.toutcourtc.tests.verbes.ElerEterSansDoublement.Companion.elerEterSansDoubelement
import com.toutcourtc.tests.verbes.InfinitifsVariantes.Companion.variantesVerbes
import com.toutcourtc.tests.verbes.accentsaiguversgrave.StringHarmonizationEler.Companion.eler
import com.toutcourtc.tests.verbes.accentsaiguversgrave.StringHarmonizationErer.Companion.erer
import com.toutcourtc.tests.verbes.accentsaiguversgrave.StringHarmonizationEter.Companion.eter
import com.toutcourtc.tests.verbes.accentsaiguversgrave.StringHarmonizationExxer.Companion.exxer

val verbs = (infinitifs1.keys + infinitifs2.keys + infinitifs3.keys + infinitifs4.keys).toList().triFr()
val verbesAccents = (eler + eter + erer + exxer).values.filter{it.endsWith("aient")}
    .map{it.replace("aient", "")}.triFr()

fun main() {

    extractEntre()

}
private fun extractTirets(){
    val file = getFile("tirets.txt", "output")
    val tirets = verbs.filter{it.contains("-")}
        .filter{!it.startsWith("entre-")}
        .filter{!it.startsWith("contre-")}

    val couples : MutableList<String> = mutableListOf()
    tirets.forEach {
        var output = it
        if(verbs.contains(it.replace("-", ""))) output += " ; ${it.replace("-", "")}"
        couples.add(output)
    }
    val data = couples.joinToString("\n")
    file?.writeText(data)
}
private fun extractContre(){
    val file = getFile("contre.txt", "output")
    val contres = verbs.filter{it.startsWith("contre-")}
    val couples : MutableList<String> = mutableListOf()
    contres.forEach {
        var output = it
        if(verbs.contains(it.replace("-", ""))) output += " ; ${it.replace("-", "")}"
        couples.add(output)
    }
    val data = couples.joinToString("\n")
    file?.writeText(data)
}
private fun extractEntre(){
    val file = getFile("entre.txt", "output")
    val entres = verbs.filter{it.startsWith("entre-")}
    val couples : MutableList<String> = mutableListOf()
    entres.forEach {
        var output = it
        if(verbs.contains(it.replace("-", ""))) output += " ; ${it.replace("-", "")}"
        couples.add(output)
    }
    val data = couples.joinToString("\n")
    file?.writeText(data)
}
private fun extractInfinitifs(){
    val src = getFile("infinitifs.txt")
    val output = getFile("infinitifs_new.txt")
    output?.setWritable(true)

    val jsonString = src?.readText()?.trim()?:""

    val type = object: TypeToken<List<Inf>>() {}.type

    val infs = Gson().fromJson<List<Inf>>(jsonString,type).map{it.value}.triFr()
    val data = infs.joinToString("\n")
    output?.writeText(data)
    output?.setReadOnly()
}

private data class Inf(val label : String, val value: String)
private fun compare(){
    val doneTemp = getFile("verbes/verbes_modif_accents_done.txt")
    val allTemp = getFile("verbes/verbes_modif_accents_all.txt")

    val all = allTemp?.readLines()?.filter {it.isNotEmpty()}?.toMutableList()
    val done = doneTemp?.readLines()?.filter{it.isNotEmpty()}


    val result = getFile("verbes/result.txt")
    val l : MutableList<String> = mutableListOf()
    all?.forEachIndexed { index, s ->
        if(s.replace("é", "e").replace("è", "e") !in done!!) {
            l.add("$index. $s")
        }
    }
    val data = l.joinToString("\n")
    result?.writeText(data)
}
private fun verbesModifAccentsDone(){
    val verbesDone = getFile("verbes/verbes_modif_accents_done.txt")
    val l : MutableList<String> = mutableListOf()

    for(verb in verbesAccents){
        val v = verb.replace("é", "e")
            .replace("è", "e")
        for(verbsrc in verbs){
            val w = verbsrc.replace("é", "e")
                .replace("è", "e")
            if(v == w){
                l.add(verbsrc)
            }
        }
    }
    val data = l.map{it.replace("é", "e").replace("è", "e")}.triFr().toSet().joinToString("\n")
    verbesDone?.writeText(data)
}
private fun verbesModifAccentsAll(){
    val verbesAccentsAll = getFile("verbes/verbes_modif_accents_all.txt")
    val l : MutableList<String> = mutableListOf()
//    val regex = Regex("(.*)é(.{1,2}er)$")
//    val regex = Regex("(.*)eter|eler|é([^aeiouéèêëàâîïôûù]{1,2}er)$")
//    val regex = Regex("^(.*)(eter|eler|é.{1,2}er)$")
    val regex = Regex("^(.*)(eter|eler|éguer|équer|é[^aeiouéèêëàâîïôûù]{1,2}er)$")

    //val regex = Regex("(.*)é((?!en|bl|tr)[^aeiouyéèêëàâîïôûùAEIOUY]{1,2}er)$")

    //Comment ça fonctionne
    //(?!en|bl|tr) : Le moteur de regex regarde devant lui et vérifie que la suite n'est ni "en", ni "bl", ni "tr". Si l'une de ces combinaisons est trouvée, la correspondance est rejetée.
    //
    //Flexibilité : Vous pouvez ajouter autant de chaînes que vous le souhaitez à l'intérieur de la parenthèse (?!...) en les séparant par |.
    //
    //Ordre d'exécution : La regex vérifie d'abord l'exclusion des chaînes complètes, puis elle valide que les caractères restants sont bien des consonnes (via la classe [^...]).

    val verbes = verbs.filter{it !in variantesVerbes.keys}
        .filter{it !in elerEterSansDoubelement}
        .filter{it !in appelerJeter}
    for(verb in verbes){
        val match = regex.find(verb)
        if(match != null){
            l.add(verb)
        }
    }
    val data = l.map{it.replace("é", "e").replace("è", "e")}.triFr().toSet().joinToString("\n")
    verbesAccentsAll?.writeText(data)
}

private fun fichierVerbesExxer(){
    val verbesEler = getFile("verbes/verbes_exxer.txt")
    var data = ""
//    val regex = Regex("(.*)é(.{1,2}er)$")
    val regex = Regex("(.*)é([^aeiouéèêëàâîïôûù]{2}er)$")

    //val regex = Regex("(.*)é((?!en|bl|tr)[^aeiouyéèêëàâîïôûùAEIOUY]{1,2}er)$")

    //Comment ça fonctionne
    //(?!en|bl|tr) : Le moteur de regex regarde devant lui et vérifie que la suite n'est ni "en", ni "bl", ni "tr". Si l'une de ces combinaisons est trouvée, la correspondance est rejetée.
    //
    //Flexibilité : Vous pouvez ajouter autant de chaînes que vous le souhaitez à l'intérieur de la parenthèse (?!...) en les séparant par |.
    //
    //Ordre d'exécution : La regex vérifie d'abord l'exclusion des chaînes complètes, puis elle valide que les caractères restants sont bien des consonnes (via la classe [^...]).

    for(verb in verbs){
        val match = regex.find(verb)
        if(match != null){
            data += "$verb\n"
        }
    }
    verbesEler?.writeText(data)
}

private fun fichierVerbesExer2(){
    val verbesEler = getFile("verbes/verbes_exer.txt")
    var data = ""
    val regex = Regex("(.*)e(.er)$")
//    val regex = Regex("(.*)e([^aeiouyéèêëàâîïôûù]{1,2}er)$")

    for(verb in verbs){
        val match = regex.find(verb)
        if(match != null){
            data += "$verb\n"
        }
    }
    verbesEler?.writeText(data)
}

private fun fichierVerbesExer1(){
    val verbesEler = getFile("verbes/verbes_éxer.txt")
    var data = ""
    val regex = Regex("(.*)é(.{1,2}er)$")
//    val regex = Regex("(.*)é([^aeiouyéèêëàâîïôûù]{1,2}er)$")

    for(verb in verbs){
        val match = regex.find(verb)
        if(match != null){
            data += "$verb\n"
        }
    }
    verbesEler?.writeText(data)
}
private fun dispatcherInfinitifs(){
    val er = getFile("verbes/groupes/er.txt")
    val ir = getFile("verbes/groupes/ir.txt")
    val autres = getFile("verbes/groupes/autres.txt")
    var dataEr = ""
    var dataIr = ""
    var dataAutres = ""

    for(verbe in infinitifs1.keys + infinitifs2.keys + infinitifs3.keys + infinitifs4.keys){
        if(verbe.endsWith("er")) dataEr += "$verbe\n"
        else if(verbe.endsWith("ir")) dataIr += "$verbe\n"
        else dataAutres += "$verbe\n"
    }
    er?.writeText(dataEr)
    ir?.writeText(dataIr)
    autres?.writeText(dataAutres)
}