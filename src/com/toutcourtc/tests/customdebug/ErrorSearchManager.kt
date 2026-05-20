package com.toutcourtc.tests.customdebug

import com.toutcourtc.tests.managers.FileManager.Companion.getFile

class ErrorSearchManager {
    companion object{
        fun searchApostrophes(fileName : String, dir : String){
            val file = getFile(fileName, dir)

            val outputName = "apos_" +
                fileName.split(".")
                .dropLast(1).joinToString(".")
                .ifEmpty{"output"} + ".txt"

            val output = getFile(outputName, "$dir/output")
            var data = ""

            val lines = file!!.readLines()
            lines.forEachIndexed { index, s ->
                val words = s.split(" ").filter{it.isNotEmpty()}

                for(w in words){
                    if(w.contains("'") && !w.contains("\\")){
                        data += "${index + 1}. $w\n"
                    }
                }
            }
            output?.writeText(data.trim())
        }

        fun searchGuillemets(fileName : String, dir : String){
            val file = getFile(fileName, dir)

            val outputName = "gui_" +
                fileName.split(".")
                .dropLast(1).joinToString(".")
                .ifEmpty{"output"} + ".txt"

            val output = getFile(outputName, "$dir/output")
            var data = ""

            val lines = file!!.readLines()
            lines.forEachIndexed { index, s ->
                if(s.contains("<item>")){
                    if(!s.contains("\\\"")){
                        if(s.contains("\"")){
                            data += "${index + 1}. $s\n"
                        }
                    }
                }
            }
            output?.writeText(data.trim())
        }
    }
}