package com.example.calmcloud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Launch1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch1)

        val buttonLaunch1: Button = findViewById(R.id.button2)
        buttonLaunch1.setOnClickListener {
            val intent = Intent(this@Launch1, OnBoard2::class.java)
            startActivity(intent)
        }

        val buttonLaunch2: Button = findViewById(R.id.button1)
        buttonLaunch2.setOnClickListener {
            val intent = Intent(this@Launch1, SignUp::class.java)
            startActivity(intent)
        }
    }
}