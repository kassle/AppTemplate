package id.netzme.apptemplate

import android.content.Context
import android.text.format.DateFormat
import androidx.test.core.app.ApplicationProvider
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import java.util.*

class DateUtilsTest {
    private val context = ApplicationProvider.getApplicationContext<Context>()
    private lateinit var dateUtils: DateUtils

    @Before
    public fun setup() {
        dateUtils = DateUtils()
    }

    @Test
    public fun getCurrentDateShouldReturnStringFormattedDateWithDefaultLocale() {
        val expected = DateFormat.getDateFormat(context).format(Date())
        val result = dateUtils.getCurrentDate(context)

        assertEquals(expected, result)
    }
}