package com.herpestes.moviesapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.herpestes.moviesapp.R
import com.herpestes.moviesapp.data.entity.Movies
import com.herpestes.moviesapp.databinding.FragmentAnasayfaBinding
import com.herpestes.moviesapp.ui.adapter.MoviesAdapter


class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.toolbarAnasayfa.title = "Filmler"

        binding.filmRV.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        val filmlerListesi = ArrayList<Movies>()
        val f1 = Movies(1, "Django", "django", 24)
        val f2 = Movies(2, "Interstaller", "interstellar", 24)
        val f3 = Movies(3, "Inception", "inception", 24)
        val f4 = Movies(4, "The Hateful Eight", "thehatefuleight", 24)
        val f5 = Movies(5, "The Pianist", "thepianist", 24)
        val f6 = Movies(6, "Anadoluda", "anadoluda", 24)
        filmlerListesi.add(f1)
        filmlerListesi.add(f2)
        filmlerListesi.add(f3)
        filmlerListesi.add(f4)
        filmlerListesi.add(f5)
        filmlerListesi.add(f6)


        val filmlerAdapter = MoviesAdapter(requireContext(), filmlerListesi)
        binding.filmRV.adapter = filmlerAdapter

        return binding.root
    }

}