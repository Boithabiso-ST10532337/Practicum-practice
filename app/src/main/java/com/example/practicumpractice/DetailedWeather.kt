package com.example.practicumpractice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailedWeather : AppCompatActivity() {

    lateinit var btnShow : Button
    lateinit var btnExit3 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_weather)

        // Recreate the weather array on the second screen
        val weather = arrayOf(
            arrayOf("Day:", "Minimum:", "Maximum:", "Weather Condition:"),
            arrayOf("Monday", "8", "22", "Partly cloudy with mostly sunny conditions."),
            arrayOf("Tuesday", "8", "19", "Sunny but windy."),
            arrayOf("Wednesday", "7", "18", "Sunny but windy. Making it feel cooler than the actual temperature"),
            arrayOf("Thursday", "7", "22", "Cloudy but low range of wind."),
            arrayOf("Friday", "9", "23", "No clouds, making it feel warmer than the actual temperature"),
            arrayOf("Saturday", "9", "19", "Sunny but windy. Making it feel cooler than the actual temperature"),
            arrayOf("Sunday", "7", "21", "Normal clouds. Cool day.")
        )

// Variable used to store the total of all maximum temperatures
        var total = 0

// Start by assuming Monday has the highest temperature
        var highest = weather[1][2].toInt()

        val txtAverage = findViewById<TextView>(R.id.txtAverage)
        val txtHighest = findViewById<TextView>(R.id.txtHighest)

// Loop through every day in the array
// Skip row 0 because it contains headings
        for (counter in 1 until weather.size) {

            // Get the maximum temperature for the current day
            val temperature = weather[counter][2].toInt()

            // Add it to the running total
            total += temperature

            // Check if it is the new highest temperature
            if (temperature > highest) {
                highest = temperature
            }
        }

// Calculate the average maximum temperature
        val average = total.toDouble() / (weather.size - 1)

// Display the average
        txtAverage.text = "Average Temperature: %.2f°C".format(average)

// Display the highest temperature
        txtHighest.text = "Highest Temperature: $highest°C"

        btnShow = findViewById(R.id.btnShow)
        btnExit3 = findViewById(R.id.btnExit3)

        //When user clicks the back home button open main screen
        btnShow.setOnClickListener {
            val intent = Intent(this, WeatherReport::class.java)
            startActivity(intent)
        }
        // When user click the exit app button exit app
        btnExit3.setOnClickListener {
            finishAffinity()
        }

    }
}