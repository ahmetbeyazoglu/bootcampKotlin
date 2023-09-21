package com.herpestes.kotlin.Day2.OOP

class Cars (var color: String, var speed: Int, var isitwork: Boolean){

    init {
        println("Constructor çalıştı")
    }

    fun run(){ //side effect: Fonksiyon ile sınıfın özelliklerini değiştirme//
        isitwork= false
        speed = 5
    }
    fun stop(){
        isitwork = true
        speed = 0
    }
    fun speedd(h: Int){
        speed+=h
    }
    fun slow(h:Int){
        speed-=h
    }

    fun takeinfo(){
        println(color)
        println(speed)
        println(isitwork)
    }



}