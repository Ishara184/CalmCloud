package com.example.calmcloud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class Profile_analysis : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_analysis)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomNavigationView.selectedItemId = R.id.profile
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.profile -> true
                R.id.library -> {
                    startActivity(Intent(applicationContext, Library::class.java))
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

                R.id.home -> {
                    startActivity(Intent(applicationContext, Homepage::class.java))
                    finish()
                    true
                }

                else -> false
            }
        }
    }
}