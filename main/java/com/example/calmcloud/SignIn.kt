package com.example.calmcloud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val textView1: TextView = findViewById(R.id.textView24)
        textView1.setOnClickListener {
            val intent = Intent(this@SignIn, SignUp::class.java)
            startActivity(intent)
        }
        val button1: Button = findViewById(R.id.button13)
        button1.setOnClickListener {
            val intent = Intent(this@SignIn, Homepage::class.java)
            startActivity(intent)
        }

    }
}