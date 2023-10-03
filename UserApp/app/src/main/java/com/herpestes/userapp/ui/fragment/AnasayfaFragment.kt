package com.herpestes.userapp.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView.OnQueryTextListener
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.herpestes.userapp.R
import com.herpestes.userapp.data.entity.Kisiler
import com.herpestes.userapp.databinding.FragmentAnasayfaBinding
import com.herpestes.userapp.ui.adapter.KisilerAdapter


class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.toolbarAnasayfa.title = "Anasayfa"

        //binding.rv.layoutManager = LinearLayoutManager(requireContext())
        binding.rv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        val kisilerListesi = ArrayList<Kisiler>()
        val k1 = Kisiler(1,"Ahmet", "1111")
        val k2 = Kisiler(2,"Zeynep", "2222")
        val k3 = Kisiler(3,"Ali", "3333")
        kisilerListesi.add(k1)
        kisilerListesi.add(k2)
        kisilerListesi.add(k3)

        val kisilerAdapter = KisilerAdapter(requireContext(), kisilerListesi)
        binding.rv.adapter = kisilerAdapter


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