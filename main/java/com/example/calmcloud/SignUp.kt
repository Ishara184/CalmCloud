package com.example.calmcloud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val textView1: TextView = findViewById(R.id.textView25)
        textView1.setOnClickListener {
            val intent = Intent(this@SignUp, SignIn::class.java)
            startActivity(intent)
        }

        val button1: Button = findViewById(R.id.button14)
        button1.setOnClickListener {
            val intent = Intent(this@SignUp, Homepage::class.java)
            startActivity(intent)
            finish()
        }
    }
}