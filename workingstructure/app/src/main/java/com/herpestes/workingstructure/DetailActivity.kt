package com.herpestes.workingstructure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.herpestes.workingstructure.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val gelenAd = intent.getStringExtra("ad")
        val gelenYas = intent.getIntExtra("yas", 0)
        val gelenBoy = intent.getDoubleExtra("boy", 0.0)
        val gelenBekar = intent.getBooleanExtra("bekar", false)

        binding.textViewInfo.text = "$gelenAd - $gelenYas - $gelenBoy - $gelenBekar"
    }
}