package com.example.newapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val welcomeTextView = findViewById<TextView>(R.id.welcomeText)
        val username = intent.getStringExtra("USERNAME")
        welcomeTextView.text = "Welcome, $username!"
    }
}
