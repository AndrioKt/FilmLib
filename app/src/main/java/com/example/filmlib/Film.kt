package com.example.filmlib

data class Film(
    val image:Int,
    val age:Int,
    val favorite:Boolean,
    val name: Int,
    val tag:Int,
    val review: Int,
    val views: Int,

    val star1:Int=R.drawable.star_icon,
    val star2:Int=R.drawable.star_icon,
    val star3:Int=R.drawable.star_icon,
    val star4:Int=R.drawable.star_icon,
    val star5:Int=R.drawable.star_icon
)

fun generateFilms() :List<Film>{
    return listOf(
        Film(R.drawable.movieframe_avengers,R.string.age_avengers,true,R.string.avengers_name,R.string.avengers_tags,R.string.reviews, R.string.views1),
        Film(R.drawable.movieframe_avengers,R.string.age_avengers,false,R.string.chris_evans,R.string.avengers_tags,R.string.reviews, R.string.views1),
        Film(R.drawable.movieframe_avengers,R.string.age_avengers,true,R.string.chris_evans,R.string.avengers_tags,R.string.reviews, R.string.views1)

    )
}
