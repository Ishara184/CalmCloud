package com.example.calmcloud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class Podcasts : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_podcasts)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomNavigationView.selectedItemId = R.id.podcast
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.podcast -> true
                R.id.library -> {
                    startActivity(Intent(applicationContext, Library::class.java))
                    finish()
                    true
                }

                R.id.home -> {
                    startActivity(Intent(applicationContext, Homepage::class.java))
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