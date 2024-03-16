package com.example.calmcloud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.google.android.material.bottomnavigation.BottomNavigationView

class Book1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book1)

        val imageView1: ImageView = findViewById(R.id.imageView13)
        imageView1.setOnClickListener {
            val intent = Intent(this@Book1, Library::class.java)
            startActivity(intent)
        }
        val button1: Button = findViewById(R.id.button)
        button1.setOnClickListener {
            val intent = Intent(this@Book1, Download::class.java)
            startActivity(intent)
        }

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomNavigationView.selectedItemId = R.id.library
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.library -> true
                R.id.home -> {
                    startActivity(Intent(applicationContext, Homepage::class.java))
                    finish()
                    true
                }

                R.id.podcast -> {
                    startActivity(Intent(applicationContext, Podcasts::class.java))
                    finish()
                    true
                }

                R.id.download -> {
                    startActivity(Intent(applicationContext, Download::class.java))
                    finish()
                    true
                }

                R.id.profile -> {
                    startActivity(Intent(applicationContext, Profile::class.java))
                    finish()
                    true
                }

                else -> false
            }
        }
    }
}