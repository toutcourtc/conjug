package com.toutcourtc.tests.managers

import com.toutcourtc.tests.managers.FileManager.Companion.getFile
import com.toutcourtc.tests.managers.StringManager.Companion.triFr

class VerbsManager {
    companion object{
        fun loadVerbs(): List<String>{
            val file = getFile("infinitifs_full.txt")

            val output = file?.readLines()
                ?.filter{it.isNotEmpty()}
                ?.map{it.trim()}
                ?.triFr()
            println(output?.size)
            return output?:listOf()
        }
    }
}