package com.example.calmcloud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.android.material.bottomnavigation.BottomNavigationView

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val imageView1: ImageView = findViewById(R.id.imageView16)
        imageView1.setOnClickListener {
            val intent = Intent(this@Profile, Profile_analysis::class.java)
            startActivity(intent)
        }
        val imageView2: ImageView = findViewById(R.id.imageView21)
        imageView2.setOnClickListener {
            val intent = Intent(this@Profile, Settings::class.java)
            startActivity(intent)
        }

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