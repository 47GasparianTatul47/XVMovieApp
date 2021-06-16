package com.example.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.Models.Models
import com.example.xmovieapp.R

class VerticalRVAdapter(val context: Context, val models: List<Models>) :
    RecyclerView.Adapter<VerticalRVAdapter.ViewHolders>() {


    class ViewHolders(view: View) : RecyclerView.ViewHolder(view) {
        val nameMovie: TextView
        val iconMovie: ImageView
        val genres: TextView

        init {
            nameMovie = view.findViewById(R.id.verticalRvItemName)
            iconMovie = view.findViewById(R.id.verticalRvItemIcon)
            genres = view.findViewById(R.id.movie_genre)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolders {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.vertical_item, parent, false)
        return ViewHolders(view)
    }

    override fun onBindViewHolder(holder: ViewHolders, position: Int) {

        holder.nameMovie.text = models[position].nameMovie
        holder.genres.text = models[position].genres
        holder.iconMovie.setImageResource(models[position].imageMovie)

        holder.itemView.startAnimation(AnimationUtils.loadAnimation(context,R.anim.anim_1))

    }

    override fun getItemCount(): Int {
        return models.size
    }
}