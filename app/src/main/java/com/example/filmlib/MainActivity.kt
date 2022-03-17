package com.example.filmlib

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import android.graphics.Shader.TileMode
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.filmlib.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        binding.btBack.setOnClickListener { finish() }
    }

    fun onClickActors1(view: View){
        val url = "https://en.wikipedia.org/wiki/Robert_Downey_Jr."
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }
    fun onClickActors2(view: View){
        val url = "https://en.wikipedia.org/wiki/Chris_Evans_(actor)"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }
    fun onClickActors3(view: View){
        val url = "https://en.wikipedia.org/wiki/Mark_Ruffin"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }
    fun onClickActors4(view: View){
        val url = "https://en.wikipedia.org/wiki/Chris_Hemsworth"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }


    fun setOnClickRate(view:View){
        binding.tvReviews.text = "${++count} Reviews"
        when(view.id){
            binding.starIcon.id -> {
                binding.starIcon2.backgroundTintList = view.resources.getColorStateList(R.color.gray_star_review, theme)
                binding.starIcon3.backgroundTintList = view.resources.getColorStateList(R.color.gray_star_review, theme)
                binding.starIcon4.backgroundTintList = view.resources.getColorStateList(R.color.gray_star_review, theme)
                binding.starIcon5.backgroundTintList = view.resources.getColorStateList(R.color.gray_star_review, theme)
            }
            binding.starIcon2.id -> {
                binding.starIcon2.backgroundTintList = view.resources.getColorStateList(R.color.rate_star_review, theme)
                binding.starIcon3.backgroundTintList = view.resources.getColorStateList(R.color.gray_star_review, theme)
                binding.starIcon4.backgroundTintList = view.resources.getColorStateList(R.color.gray_star_review, theme)
                binding.starIcon5.backgroundTintList = view.resources.getColorStateList(R.color.gray_star_review, theme)
            }
            binding.starIcon3.id -> {
                binding.starIcon2.backgroundTintList = view.resources.getColorStateList(R.color.rate_star_review, theme)
                binding.starIcon3.backgroundTintList = view.resources.getColorStateList(R.color.rate_star_review, theme)
                binding.starIcon4.backgroundTintList = view.resources.getColorStateList(R.color.gray_star_review, theme)
                binding.starIcon5.backgroundTintList = view.resources.getColorStateList(R.color.gray_star_review, theme)
            }
            binding.starIcon4.id -> {
                binding.starIcon2.backgroundTintList = view.resources.getColorStateList(R.color.rate_star_review, theme)
                binding.starIcon3.backgroundTintList = view.resources.getColorStateList(R.color.rate_star_review, theme)
                binding.starIcon4.backgroundTintList = view.resources.getColorStateList(R.color.rate_star_review, theme)
                binding.starIcon5.backgroundTintList = view.resources.getColorStateList(R.color.gray_star_review, theme)
            }
            binding.starIcon5.id -> {
                binding.starIcon2.backgroundTintList = view.resources.getColorStateList(R.color.rate_star_review, theme)
                binding.starIcon3.backgroundTintList = view.resources.getColorStateList(R.color.rate_star_review, theme)
                binding.starIcon4.backgroundTintList = view.resources.getColorStateList(R.color.rate_star_review, theme)
                binding.starIcon5.backgroundTintList = view.resources.getColorStateList(R.color.rate_star_review, theme)

            }
        }
    }
}