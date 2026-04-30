package com.toutcourtc.tests.managers

import java.text.SimpleDateFormat
import java.util.*

class DateManager {
    companion object{
        const val MINUTE = 1000L * 60L
        const val HEURE = 1000L * 60L * 60L
        const val JOUR = 1000L * 60L * 60L * 24L
        private fun formatDate(timestamp: Long): String {
            val date = Date(timestamp)
            val format = SimpleDateFormat("dd/MM/yyyy/HH:mm", Locale.getDefault())
            return format.format(date)
        }

        fun formatTimestamp(timestamp: Long): String {
            val date = Date(timestamp)
            val formatter = SimpleDateFormat("yyyyMMddHHmm", Locale.getDefault())
            return formatter.format(date)
        }

        fun Long.formattedDate(): String{
            return formatDate(this)
        }
        fun Long.inSeconds(): Long{
            // Convertir des millisecondes en secondes
            return this / 1000
        }
        fun Long.inMinutes(): Long{
            return this / (1000 * 60)
        }
        fun Long.inHours(): Long{
            return this / (1000 * 60 * 60)
        }
        fun Long.inDays(): Long{
            return this / (1000 * 60 * 60 * 24)
        }
    }
}