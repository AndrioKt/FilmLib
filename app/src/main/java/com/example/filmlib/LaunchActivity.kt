package com.example.filmlib

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.filmlib.databinding.ActivityLaunchBinding

class LaunchActivity : AppCompatActivity(), Listener {
    lateinit var binding: ActivityLaunchBinding
    val films = generateFilms()
    private val adapter = FilmAdapter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLaunchBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.filmList.adapter=adapter
        binding.filmList.layoutManager = GridLayoutManager(this, 2)




/*
        supportFragmentManager.beginTransaction()
            .replace(R.id.MovieFrame1, MovieFragment())
            .commit()

        supportFragmentManager.beginTransaction()
            .replace(R.id.MovieFrame2, MovieFragment())
            .commit()

        binding.MovieFrame1.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }*/
    }

    override fun onClick(film: Film) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}

