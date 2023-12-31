package com.herpestes.navigationcomponent

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.google.android.material.snackbar.Snackbar
import com.herpestes.navigationcomponent.databinding.FragmentMainPageBinding

class MainPageFragment : Fragment() {
    private lateinit var binding: FragmentMainPageBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMainPageBinding.inflate(inflater,container, false)

        binding.button.setOnClickListener {
            //Snackbar.make(it,"Merhaba", Snackbar.LENGTH_SHORT).show()
            //binding.textView.text = "Nasılsın"
            val product = Product(100, "TV")
            val gecis = MainPageFragmentDirections.detayGecis(product = product, ad = "Ahmet", yas = 23, boy = 1.87f, bekar = true)
            Navigation.findNavController(it).navigate(gecis)

        }

        binding.goster.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.bottomsheetgecis)
        }

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("Yaşam döngüsü", "onCreate")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Yaşam döngüsü", "onPause")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Yaşam döngüsü", "onResume")
    }


}

