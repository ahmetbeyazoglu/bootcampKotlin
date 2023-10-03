package com.herpestes.userapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.herpestes.userapp.data.entity.Kisiler
import com.herpestes.userapp.databinding.CardTasarimBinding
import com.herpestes.userapp.databinding.FragmentAnasayfaBinding

class KisilerAdapter(var mContext: Context, var kisilerListesi: List<Kisiler>) :
    RecyclerView.Adapter<KisilerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(var tasarim: CardTasarimBinding) :
        RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false )
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {

    }

    override fun getItemCount(): Int {
        return kisilerListesi.size
    }



}