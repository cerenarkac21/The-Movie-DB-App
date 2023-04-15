package com.ltu.m7019e.themoviedb

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ltu.m7019e.themoviedb.database.Movies
import com.ltu.m7019e.themoviedb.databinding.FragmentMovieListBinding
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.ltu.m7019e.themoviedb.databinding.MovieListItemBinding


/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class MovieListFragment : Fragment() { // : means inheritance.
// The FirstFragment class inherits all the functions of Fragment() superclass.

    private var _binding: FragmentMovieListBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView( // because onCreateView is the function of the superclass, we override.
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle? // state can be the positioning of the phone (landscape or portrait)
    ): View? {

        //_binding = FragmentFirstBinding.inflate(inflater, container, false)
        //return binding.root // in the first version, the two code lines above were here.
        // then added the three code lines below.
        _binding = FragmentMovieListBinding.inflate(inflater)
        val movies = Movies()
        //binding.movies = movies  //in the second version, delete this line. add the below block
        movies.list.forEach { movie ->
            val movieListItemBinding: MovieListItemBinding = DataBindingUtil.inflate(inflater, R.layout.movie_list_item, container, false)
            movieListItemBinding.movie = movie
            movieListItemBinding.root.setOnClickListener {
                //this.findNavController().navigate(MovieListFragmentDirections.a(movie))
            }

            binding.movieListLinearLayout.addView(movieListItemBinding.root)
        }

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
