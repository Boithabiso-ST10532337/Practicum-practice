package com.example.practicumpractice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WeatherReport : AppCompatActivity() {

    lateinit var btnDetailed : Button
    lateinit var btnExit2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_weather_report)

        // Create a four-dimensional array
        val weather = arrayOf(
            arrayOf("Day:", "Minimum:","Maximum:", "Weather Condition:"),
            arrayOf("Monday", "8","22", "Partly cloudy with mostly sunny conditions."),
            arrayOf("Tuesday", "8","19", "Sunny but windy."),
            arrayOf("Wednsday", "7","18", "Sunny but windy. Making it feel cooler than the actual temperature"),
            arrayOf("Thursday", "7","22", "Cloudy but low range of wind."),
            arrayOf("Friday", "9","23", "No clouds, making it feel warmer than the actual temperature"),
            arrayOf("Saturday", "9","19", "Sunny but windy. Making it feel cooler than the actual temperature"),
            arrayOf("Sunday", "7","21", "Normal clouds. Cool day.")
        )

        for (row in weather) {
            println("${row[0]} ${row[1]} ${row[2]} ${row[3]}")

        }
        //When user clicks the back home button open main screen
        btnDetailed.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        // When user click the exit app button exit app
        btnExit2.setOnClickListener {
            finishAffinity()
        }
    }
}