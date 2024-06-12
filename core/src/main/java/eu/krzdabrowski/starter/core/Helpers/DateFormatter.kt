package eu.krzdabrowski.starter.core.Helpers

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Locale

class DateFormatter {
    fun convertDateToNaturalFormat(dateString: String): String {
        val inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH)
        val outputFormatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.ENGLISH)
        val date = LocalDate.parse(dateString, inputFormatter)
        return date.format(outputFormatter)
    }
}