package com.example.filmlib

import android.app.SearchManager
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.filmlib.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val films = generateFilms()
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initialization()

        binding.btBack.setOnClickListener { finish() }
    }

    //TODO: replace with recyclerView
    fun onClickActors1(view: View){
        val intent = Intent(Intent.ACTION_WEB_SEARCH)
        intent.putExtra(SearchManager.QUERY, binding.actor1Name.text) // query contains search string
        startActivity(intent)
    }
    fun onClickActors2(view: View){
        val intent = Intent(Intent.ACTION_WEB_SEARCH)
        intent.putExtra(SearchManager.QUERY, binding.actor2Name.text) // query contains search string
        startActivity(intent)
    }
    fun onClickActors3(view: View){
        val intent = Intent(Intent.ACTION_WEB_SEARCH)
        intent.putExtra(SearchManager.QUERY, binding.actor3Name.text) // query contains search string
        startActivity(intent)
    }
    fun onClickActors4(view: View){
        val intent = Intent(Intent.ACTION_WEB_SEARCH)
        intent.putExtra(SearchManager.QUERY, binding.actor4Name.text) // query contains search string
        startActivity(intent)
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

    fun initialization(){
    binding.filmAge.setText(intent.getIntExtra("film_age",0))
    binding.filmName.setText(intent.getIntExtra("film_name",0))
    binding.filmTag.setText(intent.getIntExtra("film_tag",0))
    binding.tvDescription.setText(intent.getIntExtra("film_storyline",0))
    binding.backImg.setBackgroundResource(intent.getIntExtra("film_image",0))
    binding.tvReviews.setText(intent.getIntExtra("film_reviews",0))
    binding.actor1Name.setText(intent.getIntExtra("actor1_name",0))
    binding.actor1.setBackgroundResource(intent.getIntExtra("actor1_img",0))
    binding.actor2Name.setText(intent.getIntExtra("actor2_name",0))
    binding.actor2.setBackgroundResource(intent.getIntExtra("actor2_img",0))
    binding.actor3Name.setText(intent.getIntExtra("actor3_name",0))
    binding.actor3.setBackgroundResource(intent.getIntExtra("actor3_img",0))
    binding.actor4Name.setText(intent.getIntExtra("actor4_name",0))
    binding.actor4.setBackgroundResource(intent.getIntExtra("actor4_img",0))
    }
}