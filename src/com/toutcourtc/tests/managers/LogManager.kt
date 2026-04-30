package com.toutcourtc.tests.managers

import com.toutcourtc.tests.managers.DateManager.Companion.JOUR
import com.toutcourtc.tests.managers.DateManager.Companion.formattedDate
import com.toutcourtc.tests.managers.FileManager.Companion.getFile

class LogManager {
    companion object {
        fun log(title: String, msg: String) {
            val timestamp = System.currentTimeMillis()
            val date = timestamp.formattedDate()

            val suffix = date.split("/").take(3).reversed().joinToString("")

            val fileName = "log_$suffix.txt"
            val file = getFile(fileName, "logs")

            // à mettre en coroutines pour éviter les conflits
            val lines = (file?.readLines()?.toMutableList()?.ifEmpty { mutableListOf("$timestamp") })
                ?: mutableListOf("$timestamp")
            val message = msg.replace("\n", " ")
                .replace("\t", " ")
                .split(" ")
                .chunked(20)
                .joinToString("\n") { "\t\t\t\t${it.joinToString(" ")}" }

            val newValue = "$date - $title\n$message"
            lines.add(newValue)
            file?.writeText(lines.joinToString("\n"))

            cleanLogs()
        }

        private fun cleanLogs() {
            //Suppression des logs de plus de28 jours
            //Lancer en coroutine
            val dir = getFile("logs")
            dir?.listFiles()?.map { it.name }?.forEach {
                val file = getFile(it, "logs")
                if(file != null){
                    val content = file.readLines()
                    if(content.isNotEmpty()){
                        try{
                            val creationTimestamp = content.first().toLong()

                            // Vérifier ce que fait la fonction File.delete - Non testée
                            if(System.currentTimeMillis() - creationTimestamp > 28 * JOUR) file.delete()
                        }catch(e:Exception){e.printStackTrace()}
                    }
                }
            }
        }
    }
}