package com.toutcourtc.tests.verbes

class InfinitifsVariantes {

    companion object{
        val variantesVerbes : Map<String, String> = mapOf(
            // Cas demandés précédemment
            "asseoir" to "assoir",
            "enchaucener" to "enchaussener",
            "liserer" to "lisérer",
            "reséquer" to "réséquer",
            "saouler" to "souler",
            "soûler" to "souler",
            "desaouler" to "dessouler",
            "dessoûler" to "dessouler",

            // soûler, resouler . . .

            // Rectifications de 1990 (Accentuation et traits d'union)
            "assener" to "asséner",
            "boursoufler" to "boursouffler",

            // Variantes de traits d'union (Soudure)
            // voir la série des verbes avec entre ou contre
            "arc-bouter" to "arcbouter",
//        "entre-dégorger" to "entredégorger",
//        "entre-frapper" to "entrefrapper",
//        "entre-heurter" to "entreheurter",
//        "entre-nuire" to "entrenuire",
//        "entre-regarder" to "entreregarder",
            "entre-pénétrer" to "entrepénétrer",
            "entre-tuer" to "entretuer",
            "entr'appeler" to "entrappeler",

            // Autres variantes graphiques courantes
            "fayotter" to "fayoter",
            "frisoter" to "frisotter",
            // Voir toute la série des verbes en oter / otter

            "translitérer" to "translittérer",

            "cafeter" to "cafter",
            "caleter" to "calter",
            "becqueter" to "béqueter",
            "débecqueter" to "débéqueter",
            "secréter" to "sécréter",
            "fleureter" to "flirter",
            "receler" to "recéler",
            "admonester" to "admonéter",
//            "entr'appeler" to "entrappeler", ajouter les verbes avec entr sans '
            "faseier" to "faséyer",
            "fazeier" to "faséyer",
            "faseyer" to "faséyer",
            "faseiller" to "faséyer",
            "fasier" to "faséyer",
            "fazier" to "faséyer",
            "galéger" to "galéjer",
            "guilleméter" to "guillemeter",
            "hyperhémier" to "hyperémier",
            "appiéger" to "appieger",
            "canneter" to "caneter",
            "rengrener" to "rengréner",
            "foëner" to "foéner",
            "fouffeter" to "foufeter",
            "refréner" to "réfréner",
            "mouffeter" to "moufeter"
        )
        private fun variantesInverses(): Map<String, String>{
            val output : MutableMap<String, String> = mutableMapOf()
            variantesVerbes.map{
                output[it.value] = it.key // Attention : pour les verbes en double, le dernier sera concervé
            }
            return output.toMap()
        }
        fun String.getVariantes(): List<String>?{
            val v0 = variantesVerbes[this]?:this
            val v1s = variantesVerbes.keys.filter{variantesVerbes[it] == v0}
            val v2s : List<String> = variantesInverses()[v0]?.let{listOf(it)}?:listOf()
            return (v1s + v2s).toSet().toList().ifEmpty { null }
        }
        fun String.harmonizeVariantesVerbes():String{
            return variantesVerbes[this]?:this
        }
    }
}