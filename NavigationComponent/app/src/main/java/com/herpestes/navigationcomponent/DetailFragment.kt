package com.herpestes.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.navArgs
import com.google.android.material.snackbar.Snackbar
import com.herpestes.navigationcomponent.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentDetailBinding.inflate(inflater, container, false)

        val bundle: DetailFragmentArgs by navArgs()
        val gelenAd = bundle.ad
        val gelenyas = bundle.yas
        val gelenboy = bundle.boy
        val gelenBekar = bundle.bekar

        val urunId = bundle.product.id
        val urunAd = bundle.product.ad


        binding.textView2.text = "$gelenAd - $gelenBekar - $gelenyas - $gelenboy - $urunAd - $urunId"


        val backPress = object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                Snackbar.make(binding.textView2, "Geri dönmek istiyor musunuz?", Snackbar.LENGTH_SHORT)
                    .setAction("EVET"){
                        isEnabled = false//geri dönüş aktif
                        requireActivity().onBackPressedDispatcher.onBackPressed()
                    }
                    .show()
            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, backPress)

        return binding.root
    }
}