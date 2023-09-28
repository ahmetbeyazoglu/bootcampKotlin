package com.herpestes.workingstructure

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.herpestes.workingstructure.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonDetail.setOnClickListener {
            //Snackbar.make(it, "Merhaba", Snackbar.LENGTH_SHORT).show()

            val intent = Intent(this@MainActivity, DetailActivity::class.java)

            intent.putExtra("ad", "Ahmet")
            intent.putExtra("yas", 23)
            intent.putExtra("boy", 1.87)
            intent.putExtra("bekar", true)

            startActivity(intent)

        }


    }
}