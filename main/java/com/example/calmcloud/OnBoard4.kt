package com.example.calmcloud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OnBoard4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_board4)

        val button7: Button = findViewById(R.id.button7)
        button7.setOnClickListener {
            val intent = Intent(this@OnBoard4, Launch1::class.java)
            startActivity(intent)
        }

    }
}