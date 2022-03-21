package com.example.filmlib

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
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

    }

    override fun onClick(film: Film,position: Int) {
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("film_age",film.age)
        intent.putExtra("film_name",film.name)
        intent.putExtra("film_image",film.main_backImage)
        intent.putExtra("film_tag",film.tag)
        intent.putExtra("film_reviews",film.review)
        intent.putExtra("film_storyline",film.main_storyline)
        intent.putExtra("actor1_img",film.actor1_img)
        intent.putExtra("actor1_name",film.actor1_name)
        intent.putExtra("actor2_img",film.actor2_img)
        intent.putExtra("actor2_name",film.actor2_name)
        intent.putExtra("actor3_img",film.actor3_img)
        intent.putExtra("actor3_name",film.actor3_name)
        intent.putExtra("actor4_img",film.actor4_img)
        intent.putExtra("actor4_name",film.actor4_name)
        startActivity(intent)
    }

    override fun onFav(film: Film, position:Int) {
        adapter.notifyItemChanged(position)
    }



}

