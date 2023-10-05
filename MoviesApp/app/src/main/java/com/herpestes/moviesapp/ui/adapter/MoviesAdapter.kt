package com.herpestes.moviesapp.ui.adapter

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.herpestes.moviesapp.data.entity.Movies
import com.herpestes.moviesapp.databinding.CardTasarimBinding

class MoviesAdapter(var mContext: Context, var filmlerListesi: List<Movies>)
    : RecyclerView.Adapter<MoviesAdapter.CardTasarimTutucu>(){

    inner class CardTasarimTutucu(var tasarim: CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        TODO("Not yet implemented")
    }


    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}