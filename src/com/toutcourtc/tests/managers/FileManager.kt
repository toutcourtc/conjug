package com.toutcourtc.tests.managers

import com.toutcourtc.tests.Params.Companion.ROOT
import java.io.File

class FileManager {
    companion object{

        private fun createFolder(folderName: String, dir: String = ROOT): File? {
            // Définir le chemin du dossier à créer

            val folder = File(dir, folderName)

            // Créer le dossier s'il n'existe pas encore
            if (!folder.exists()) {
                val success = folder.mkdirs()
                if (!success) {
                    println("Échec de la création du dossier $folderName")
                    return null
                }
            }
            return folder
        }

        fun getFile(fileName: String, dir: String = ROOT): File? {
            var directory = dir
            if(dir != ROOT){
                createFolder(dir)
                directory = ROOT + "\\$dir"
            }
            // Définir le chemin du fichier
            val file = File(directory, fileName)

            // Créer le fichier s'il n'existe pas
            if (!file.exists()) {
                val success = file.createNewFile()
                if (!success) {
                    println("Échec de la création du fichier $fileName")
                    return null
                }
            }
            return file
        }
    }
}