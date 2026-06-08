package com.example.practicumpractice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //Declaring buttons
    lateinit var btnReport: Button
    lateinit var btnExit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Linking the button variable to the actual button
        btnReport = findViewById(R.id.btnReport)
        btnExit = findViewById(R.id.btnExit)

        //When user clicks the report button open main screen
        btnReport.setOnClickListener {
            val intent = Intent(this, DetailedWeather::class.java)
            startActivity(intent)
        }
        // When user click the exit app button exit app
        btnExit.setOnClickListener {
            finishAffinity()
        }
    }
}