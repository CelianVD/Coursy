package com.example.coursy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton: Button = findViewById(R.id.startButton)

        startButton.setOnClickListener {
            // Plus tard : Redirection vers page de connexion ou tutoriel
            val intent = Intent(this, NextActivity::class.java)
            startActivity(intent)
        }
    }
}
