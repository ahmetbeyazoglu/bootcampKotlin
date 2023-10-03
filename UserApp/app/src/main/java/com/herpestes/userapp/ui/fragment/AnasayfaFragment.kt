package com.herpestes.userapp.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView.OnQueryTextListener
import androidx.navigation.Navigation
import com.herpestes.userapp.R
import com.herpestes.userapp.data.entity.Kisiler
import com.herpestes.userapp.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.fab.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.kisiKayitGecis)
        }

        binding.searchView.setOnQueryTextListener(object: OnQueryTextListener{
            override fun onQueryTextChange(newText: String): Boolean { //yazarken aramasını sağlar
                ara(newText)
                return true
            }

            override fun onQueryTextSubmit(query: String): Boolean { // çıkan arama butonu ile çalışır
                ara(query)
                return true
            }
        })
        return binding.root
    }
    fun ara(aramaKelime: String){
        Log.e("Kişi ara", aramaKelime)
    }

}