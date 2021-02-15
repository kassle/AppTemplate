package id.netzme.apptemplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.format.DateFormat
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        setDate()
    }

    private fun setDate() {
        var dateUtils = DateUtils()
        var tanggal = dateUtils.getCurrentDate(this)
        findViewById<TextView>(R.id.tvDate).text = tanggal
    }
}