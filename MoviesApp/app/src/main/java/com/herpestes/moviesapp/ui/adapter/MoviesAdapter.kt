package com.herpestes.moviesapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.herpestes.moviesapp.data.entity.Movies
import com.herpestes.moviesapp.databinding.CardTasarimBinding
import com.herpestes.moviesapp.ui.fragment.AnasayfaFragmentDirections

class MoviesAdapter(var mContext: Context, var filmlerListesi: List<Movies>)
    : RecyclerView.Adapter<MoviesAdapter.CardTasarimTutucu>(){

    inner class CardTasarimTutucu(var tasarim: CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(binding)
    }


    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val film = filmlerListesi.get(position)
        val t = holder.tasarim

        t.imageViewFilm.setImageResource(
            mContext.resources.getIdentifier(
                film.resim,
                "drawable",
                mContext.packageName
            )
        )
        t.textViewFiyat.text = "${film.fiyat} ₺"

        t.cardviewFilm.setOnClickListener {
            val gecis = AnasayfaFragmentDirections.detayGecis(film = film)
            Navigation.findNavController(it).navigate(gecis)
        }
        t.buttonSepet.setOnClickListener {
            Snackbar.make(it, "${film.ad} sepete eklendi!", Snackbar.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return filmlerListesi.size
    }

}