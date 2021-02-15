package id.netzme.apptemplate

import android.content.Context
import android.text.format.DateFormat
import java.util.*

class DateUtils {
    fun getCurrentDate(context: Context) : CharSequence {
        var dateFormat = DateFormat.getDateFormat(context)
        return dateFormat.format(Date())
    }
}