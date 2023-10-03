package com.herpestes.userapp.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.herpestes.userapp.R
import com.herpestes.userapp.databinding.FragmentKisiDetayBinding


class KisiDetayFragment : Fragment() {
    private lateinit var binding : FragmentKisiDetayBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentKisiDetayBinding.inflate(inflater, container, false)

        binding.toolbarKisiDetay.title = "Kişi Detay"

        val bundle: KisiDetayFragmentArgs by navArgs()
        val gelenKisi = bundle.kisi

        binding.editTextKisiAd.setText(gelenKisi.kisi_ad)
        binding.editTextKisiTel.setText(gelenKisi.kisi_tel)

        binding.buttonGNcelle.setOnClickListener {
            val kisi_ad = binding.editTextKisiAd.text.toString()
            val kisi_tel = binding.editTextKisiTel.text.toString()

            guncelle(gelenKisi.kisi_id.toString(), kisi_ad, kisi_tel)

        }


        return binding.root
    }
    fun guncelle(kisi_id: String, kisi_ad: String, kisi_tel: String){
        Log.e("Kişi Güncelle", "$kisi_id - $kisi_ad - $kisi_tel")
    }
}