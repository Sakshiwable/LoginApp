package com.example.newapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usernameEditText = findViewById<EditText>(R.id.usernameInput)
        val passwordEditText = findViewById<EditText>(R.id.passwordInput)
        val submitButton = findViewById<Button>(R.id.submitBtn)

        submitButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val intent = Intent(this, WelcomeActivity::class.java)
            intent.putExtra("USERNAME", username)
            startActivity(intent)
        }
    }
}
