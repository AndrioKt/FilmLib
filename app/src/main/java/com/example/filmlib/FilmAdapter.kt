package com.example.filmlib


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.filmlib.databinding.MovieFragmentBinding


class FilmAdapter(val listener: Listener):RecyclerView.Adapter<FilmAdapter.FilmHolder>() {
    val films = generateFilms()
    class FilmHolder(item: View):RecyclerView.ViewHolder(item) {
        val binding = MovieFragmentBinding.bind(item)
        fun bind(film:Film, listener: Listener,films:List<Film>) = with(binding){
            binding.apply {
                age.setText(film.age)
                FragmMovie.setBackgroundResource(film.image)
                if(film.favorite)imgFavorite.setImageResource(R.drawable.favorite_icon)else imgFavorite.setImageResource(R.drawable.empty_favorite_icon)
                filmname.setText(film.name)
                tag.setText(film.tag)
                views1.setText(film.views)
                reviews.setText(film.review)

                star1.setImageResource(R.drawable.star_icon)
                star2.setImageResource(R.drawable.star_icon)
                star3.setImageResource(R.drawable.star_icon)
                star4.setImageResource(R.drawable.star_icon)
                star5.setBackgroundResource(R.drawable.star_icon)

                itemView.setOnClickListener{
                    listener.onClick(film,adapterPosition)
                }
                imgFavorite.setOnClickListener {
                    films[adapterPosition].favorite = !film.favorite
                    listener.onFav(film,adapterPosition)
                }
            }
        }
    }





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmHolder {
        val view = LayoutInflater.from(parent.context).inflate( R.layout.movie_fragment,parent,false)
        return FilmHolder(view)

    }

    override fun onBindViewHolder(holder: FilmHolder, position: Int) {
        holder.bind(films[position],listener,films)
    }

    override fun getItemCount(): Int = films.size


}

interface Listener{
    fun onClick(film: Film,position:Int)
    fun onFav(film: Film,position:Int)
}