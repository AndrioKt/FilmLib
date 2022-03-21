package com.example.filmlib

data class Film(
    val id:Int,

    val image:Int,
    val age:Int,
    var favorite:Boolean,
    val name: Int,
    val tag:Int,
    val review: Int,
    val views: Int,

    //For film Activity
    val main_backImage:Int,
    val main_storyline:Int,

    //TODO: Replace with recyclerView
    val actor1_img:Int=R.drawable.robert,
    val actor2_img:Int = R.drawable.evans,
    val actor3_img:Int = R.drawable.mark,
    val actor4_img:Int= R.drawable.hems,

    val actor1_name:Int,
    val actor2_name:Int,
    val actor3_name:Int,
    val actor4_name:Int,



    //TODO: Change this
    val star1:Int=R.drawable.star_icon,
    val star2:Int=R.drawable.star_icon,
    val star3:Int=R.drawable.star_icon,
    val star4:Int=R.drawable.star_icon,
    val star5:Int=R.drawable.star_icon


    )

    //TODO: Replace with a database
fun generateFilms() :List<Film>{
    return listOf(
        Film(1,R.drawable.movieframe_avengers,R.string.age_avengers,true,R.string.avengers_name,R.string.avengers_tags,R.string.reviews, R.string.avengers_views,R.drawable.avengers_backimg,R.string.avengers_storyline,R.drawable.robert,R.drawable.evans,R.drawable.mark,R.drawable.evans,R.string.robert_down,R.string.chris_evans,R.string.mark_ruffalo,R.string.chris_hemsworth),
        Film(2,R.drawable.movieframe_tenet,R.string.tenet_age,true,R.string.tenet_name,R.string.tenet_tags,R.string.reviews, R.string.tenet_views,R.drawable.tenet_backimg,R.string.tenet_storyline,R.drawable.john__david_washington,R.drawable.robert_pattinson,R.drawable.elizabeth_debicki,R.drawable.kenneth_branagh,R.string.john_david_washington,R.string.robert_pattinson,R.string.elizabeth_debicki,R.string.kenneth_branagh),
        Film(3,R.drawable.movieframe_blackwidow,R.string.black_widow_age,false,R.string.black_widow_name,R.string.black_widow_tags,R.string.reviews, R.string.black_widow_views,R.drawable.black_widow_backimg,R.string.black_widow_storyline,R.drawable.scarlett_johansson,R.drawable.florence_pugh,R.drawable.david_harbour,R.drawable.ot_fagbenle,R.string.scarlett_johansson,R.string.florence_pugh,R.string.david_harbour,R.string.OT_fagbenle),
        Film(4,R.drawable.movieframe_wonderwoman,R.string.wonder_woman_age,false,R.string.wonder_woman_name,R.string.wonder_woman_tags,R.string.reviews, R.string.wonder_woman_views,R.drawable.wonder_woman_backimg,R.string.wonder_woman_storyline,R.drawable.gal_gadot,R.drawable.chris_pine,R.drawable.kristen_wiig,R.drawable.pedro_pascal,R.string.gal_gadot,R.string.chris_pine,R.string.kristen_wiig,R.string.pedro_pascal),


    )
}
