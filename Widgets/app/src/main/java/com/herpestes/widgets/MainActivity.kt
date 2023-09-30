package com.herpestes.widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.herpestes.widgets.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOku.setOnClickListener {
            val alinanVeri = binding.editTextGirdi.text.toString()
            binding.textViewSonuc.text = alinanVeri
        }

        binding.buttonResim1.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.resim1)
        }

        binding.buttonResim2.setOnClickListener {
            binding.imageView.setImageResource(resources.getIdentifier("resim2", "drawable", packageName))
        }

        binding.switch1.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked){
                Log.e("Widgets", "Switch on")
            }else{
                Log.e("Widgets", "Switch off")
            }

        }
        binding.toggleButton.addOnButtonCheckedListener { group, checkedId, isChecked ->
            val secilenButton = findViewById<Button>(binding.toggleButton.checkedButtonId)
            val buttonYazi = secilenButton.text.toString()
            Log.e("Widgets", buttonYazi)
        }

        binding.buttonGoster.setOnClickListener {
            Log.e("Widgets", "Switch Durum: ${binding.switch1.isChecked}")
          /*  val secilenButton = findViewById<Button>(binding.toggleButton.checkedButtonId)
            val buttonYazi = secilenButton.text.toString()
            Log.e("Widgets", "Toggle Durum: ${buttonYazi}")*/
        }


    }
}