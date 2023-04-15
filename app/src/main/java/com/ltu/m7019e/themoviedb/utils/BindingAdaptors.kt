package com.ltu.m7019e.themoviedb.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("posterImageUrl") // to make the connection the ley "posterImageUrl" will be used.
// the first parameter is the type of the element that will be binded
// the second is the value that will be passed (for example, for texts, it is text: String
fun bindPosterImage(imgView: ImageView, imgUrl:String){
    imgUrl?.let {
        Glide
            .with(imgView)
            .load(Constants.POSTER_IMAGE_BASE_URL + Constants.POSTER_IMAGE_WIDTH + it)
            .into(imgView)
    }

}

@BindingAdapter("backdropImageUrl")
fun bindBackdropImage(imgView: ImageView, imgUrl:String) {
    imgUrl?.let { backdropPath ->
        Glide
            .with(imgView)
            .load(Constants.BACKDROP_IMAGE_BASE_URL + Constants.BACKDROP_IMAGE_WIDTH + backdropPath)
            .into(imgView);
    }
}