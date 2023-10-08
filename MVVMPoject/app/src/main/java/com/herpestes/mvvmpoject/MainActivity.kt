package com.herpestes.mvvmpoject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.herpestes.mvvmpoject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.mainActivityNesnesi = this



        binding.hesaplamaSonuc = "0"
        View.VISIBLE
        View.INVISIBLE

        binding.buttonToplama.setOnClickListener {

        }

        binding.buttonCarpma.setOnClickListener {

        }

    }

    fun buttonToplamaTikla(alinansayi1: String, alinansayi2: String){
        val sayi1 = alinansayi1.toInt()
        val sayi2 = alinansayi2.toInt()
        val toplam = sayi1 + sayi2

        binding.hesaplamaSonuc = toplam.toString()
    }

    fun buttonCarpmaTikla(alinansayi1: String, alinansayi2: String){

        val sayi1 = alinansayi1.toInt()
        val sayi2 = alinansayi2.toInt()
        val carpma = sayi1 * sayi2

        binding.hesaplamaSonuc = carpma.toString()
    }


}