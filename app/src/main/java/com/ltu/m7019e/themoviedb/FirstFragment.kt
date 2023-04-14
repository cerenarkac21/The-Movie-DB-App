package com.ltu.m7019e.themoviedb

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.ltu.m7019e.themoviedb.database.Movies
import com.ltu.m7019e.themoviedb.databinding.FragmentFirstBinding
import com.ltu.m7019e.themoviedb.utils.Constants
import android.graphics.drawable.Drawable
import androidx.databinding.DataBindingUtil


/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() { // : means inheritance.
// The FirstFragment class inherits all the functions of Fragment() superclass.

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView( // because onCreateView is the function of the superclass, we override.
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle? // state can be the positioning of the phone (landscape or portrait)
    ): View? {

        //_binding = FragmentFirstBinding.inflate(inflater, container, false)
        //return binding.root
        _binding = DataBindingUtil.inflate(inflater, R.layout.fragment_first, container, false)
        val movies = Movies()
        binding.movies = movies
        return binding.root

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /*
        val movies = Movies()

        /*
        layout handler function

        inside of <> is the return type.

        */
        val movieList = view.findViewById<LinearLayout>(R.id.movie_list_linear_layout)
        val movieItem = movieList.findViewById<View>(R.id.movie_1)
        val movieTitle = movieItem.findViewById<TextView>(R.id.movie_title)
        val moviePoster = movieItem.findViewById<ImageView>(R.id.movie_poster)

        movieTitle.text = movies.list[0].title

        Glide
            .with(this)
            .load(Constants.POSTER_IMAGE_BASE_URL + Constants.POSTER_IMAGE_WIDTH + movies.list[0].posterPath)
            .into(moviePoster)
         */
    }
}
