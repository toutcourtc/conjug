package com.toutcourtc.tests.managers

import java.text.Collator

class StringManager {
    companion object{
        fun List<String>.triFr(): List<String>{
            // Pour faire un tri en tenant compte de la langue, notammant des accents
            val collator = Collator.getInstance(java.util.Locale.FRENCH)
            collator.strength = Collator.PRIMARY // Ignore les différences de casse et d'accents
            return this.sortedWith(collator)
        }
    }
}