package com.example.calmcloud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val imageView1: ImageView = findViewById(R.id.imageView19)
        imageView1.setOnClickListener {
            val intent = Intent(this@Settings, Profile::class.java)
            startActivity(intent)
        }

        val button1: Button = findViewById(R.id.button9)
        button1.setOnClickListener {
            val intent = Intent(this@Settings, SignIn::class.java)
            startActivity(intent)
        }

        val button2: Button = findViewById(R.id.button11)
        button2.setOnClickListener {
            val intent = Intent(this@Settings, SignUp::class.java)
            startActivity(intent)
        }
    }
}