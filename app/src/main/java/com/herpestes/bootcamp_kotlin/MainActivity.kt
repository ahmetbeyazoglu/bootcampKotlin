package com.herpestes.bootcamp_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var str1: String? = null
    lateinit var str2: String //Değişken daha sonra tanımlanacak **val ile kullanılmaz
    //lateinit var sayi: Int //Primitiv tiplerde kullanılmaz
    var sayi: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        str2 = "Merhaba"


    }
}