package com.example.filmlib

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.filmlib.databinding.ActivityLaunchBinding

class LaunchActivity : AppCompatActivity() {
    lateinit var binding: ActivityLaunchBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLaunchBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .replace(R.id.MovieFrame1, MovieFragment())
            .commit()

        supportFragmentManager.beginTransaction()
            .replace(R.id.MovieFrame2, MovieFragment())
            .commit()

        binding.MovieFrame1.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}

