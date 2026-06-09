package com.example.practicumpractice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WeatherReport : AppCompatActivity() {

    lateinit var btnDetailed : Button
    lateinit var btnExit2 : Button
    lateinit var txtWeather: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_weather_report)

        txtWeather = findViewById(R.id.txtWeather)
        btnDetailed = findViewById(R.id.btnDetailed)
        btnExit2 = findViewById(R.id.btnExit2)

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

        // Create a StringBuilder to efficiently build a long text string
        val builder = StringBuilder()

// Loop through the weather array starting from index 1
        for (i in 1 until weather.size) {

            // Get the current row (one day's weather data)
            val row = weather[i]

            // Append the day name with a label and new line
            builder.append("Day: ${row[0]}\n")

            // Append minimum temperature with label and new line
            builder.append("Minimum: ${row[1]}\n")

            // Append maximum temperature with label and new line
            builder.append("Maximum: ${row[2]}\n")

            // Append weather description with label and new line
            builder.append("Weather Condition: ${row[3]}\n")

            // Add an extra blank line to separate each day visually
            builder.append("\n")
        }

// Finally, set the full formatted text into the TextView
// so it appears on the screen for the user
        txtWeather.text = builder.toString()
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