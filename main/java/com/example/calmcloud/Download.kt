package com.example.calmcloud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView

class Download : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_download)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomNavigationView.selectedItemId = R.id.download
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.download -> true
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

                R.id.home -> {
                    startActivity(Intent(applicationContext, Homepage::class.java))
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

        val buttonLaunch1: Button = findViewById(R.id.button12)
        buttonLaunch1.setOnClickListener {
            val intent = Intent(this@Download, Library::class.java)
            startActivity(intent)
        }
    }
}