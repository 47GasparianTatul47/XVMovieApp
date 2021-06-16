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

class HorizontalRVAdapter(val context: Context, val models: List<Models>) :
    RecyclerView.Adapter<HorizontalRVAdapter.ViewHolder>() {


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val nameMovie: TextView
        val iconMovie: ImageView

        init {
            nameMovie = view.findViewById(R.id.horizontalRvItemName)
            iconMovie = itemView.findViewById(R.id.horizontalRvItemIcon)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.horizontal_item, parent, false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.nameMovie.text = models[position].nameMovie
        holder.iconMovie.setImageResource(models[position].imageMovie)

    }

    override fun getItemCount(): Int {
        return models.size
    }
}