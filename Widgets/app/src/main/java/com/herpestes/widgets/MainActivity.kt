package com.herpestes.widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import com.google.android.material.datepicker.MaterialDatePicker
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.TimeFormat
import com.herpestes.widgets.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var kontrol = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //TextView Read
        binding.buttonOku.setOnClickListener {
            val alinanVeri = binding.editTextGirdi.text.toString()
            binding.textViewSonuc.text = alinanVeri
        }
        //Image change
        binding.buttonResim1.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.resim1)
        }

        binding.buttonResim2.setOnClickListener {
            binding.imageView.setImageResource(resources.getIdentifier("resim2", "drawable", packageName))
        }
    //Switch
        binding.switch1.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked){
                Log.e("Widgets", "Switch on")
            }else{
                Log.e("Widgets", "Switch off")
            }

        }
        //ToggleButton
        binding.toggleButton.addOnButtonCheckedListener { group, checkedId, isChecked ->
            kontrol = isChecked
            if(kontrol) {
                val secilenButton = findViewById<Button>(binding.toggleButton.checkedButtonId)
                val buttonYazi = secilenButton.text.toString()
                Log.e("Widgets", buttonYazi)
            }
        }

        //Dropdown menu
        val ulkeler = ArrayList<String>()
        ulkeler.add("TR")
        ulkeler.add("JP")
        ulkeler.add("İT")

        //Read DropDown menu
        val ulke = binding.autoCompleteTextView.text.toString()


        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, ulkeler)
        binding.autoCompleteTextView.setAdapter(arrayAdapter)

        //ProgressBar
        binding.buttonBasla.setOnClickListener {
            binding.progressBar.visibility = View.VISIBLE
        }
        binding.buttonDur.setOnClickListener {
            binding.progressBar.visibility = View.INVISIBLE
        }

        //SliderBar

        binding.textViewSlider.text = binding.slider.progress.toString() // o anki değerinden başlamasını sağlar biz default 30 verdik

        binding.slider.setOnSeekBarChangeListener(object: OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                binding.textViewSlider.text = progress.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}

            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        //Clock and Date

        binding.buttonSaat.setOnClickListener {
            val tp = MaterialTimePicker.Builder()
                .setTitleText("Saat kaç")
                .setTimeFormat(TimeFormat.CLOCK_24H)
                .build()

            tp.show(supportFragmentManager, "Saat")

            tp.addOnPositiveButtonClickListener {
                binding.editTextTextSaat.setText("${tp.hour} : ${tp.minute}")
            }
        }
        binding.buttonTarih.setOnClickListener {
            val dp = MaterialDatePicker.Builder.datePicker()
                .setTitleText("Tarih Seç")
                .build()

            dp.show(supportFragmentManager, "Tarih")

            dp.addOnPositiveButtonClickListener {
                val df = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
                val tarih = df.format(it)
                binding.editTextTarih.setText(tarih)
            }
        }


        //Switch
        binding.buttonGoster.setOnClickListener {
            Log.e("Widgets", "Switch Durum: ${binding.switch1.isChecked}")
            if(kontrol) {
                val secilenButton = findViewById<Button>(binding.toggleButton.checkedButtonId)
                val buttonYazi = secilenButton.text.toString()
                Log.e("Widgets", "Toggle Durum: ${buttonYazi}")
                Log.e("Widgets", "Slider Durum ${binding.slider.progress}") //O anki değeri basar
                Log.e("Widgets", "Ülke ${ulke}") //Dropdown menu
            }
        }


    }
}