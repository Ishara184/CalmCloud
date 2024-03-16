package com.example.calmcloud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class OnBoard3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_board3)

        val imageView4: ImageView = findViewById(R.id.imageView4)
        imageView4.setOnClickListener {
            val intent = Intent(this@OnBoard3, OnBoard2::class.java)
            startActivity(intent)
        }

        val button1: Button = findViewById(R.id.button6)
        button1.setOnClickListener {
            val intent = Intent(this@OnBoard3, SignIn::class.java)
            startActivity(intent)
            finish()
        }

        val button2: Button = findViewById(R.id.button5)
        button2.setOnClickListener {
            val intent = Intent(this@OnBoard3, SignIn::class.java)
            startActivity(intent)
        }
    }
}