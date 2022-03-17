package com.example.filmlib

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import com.example.filmlib.databinding.MovieFragmentBinding

class MovieFragment : Fragment() {
    lateinit var binding: MovieFragmentBinding
    private lateinit var viewModel: MovieViewModel
    var favorites_count =0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= MovieFragmentBinding.inflate(inflater,container,false)
        val view = binding.root
        return view


    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MovieViewModel::class.java)
        // TODO: Use the ViewModel

        binding.imgFavorite.setOnClickListener {

            if (favorites_count == 0)
            {
                binding.imgFavorite.setImageResource(R.drawable.empty_favorite_icon)
                favorites_count = 1
                // TODO: make the logic of adding to favorites
            }
            else {
                binding.imgFavorite.setImageResource(R.drawable.favorite_icon)
                favorites_count = 0
                // TODO: make the logic of adding to favorites
            }

        }


    }


    companion object {
        fun newInstance() = MovieFragment()
    }
}