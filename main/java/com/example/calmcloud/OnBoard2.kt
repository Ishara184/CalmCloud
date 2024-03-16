package com.example.calmcloud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class OnBoard2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_board2)

        val imageView2: ImageView = findViewById(R.id.imageView2)
        imageView2.setOnClickListener {
            val intent = Intent(this@OnBoard2, Launch1::class.java)
            startActivity(intent)
        }

        val buttonOnBoard2: Button = findViewById(R.id.button4)
        buttonOnBoard2.setOnClickListener {
            val intent = Intent(this@OnBoard2, OnBoard3::class.java)
            startActivity(intent)
        }
        val buttonLaunch1: Button = findViewById(R.id.button3)
        buttonLaunch1.setOnClickListener {
            val intent = Intent(this@OnBoard2, SignUp::class.java)
            startActivity(intent)
        }
    }
}