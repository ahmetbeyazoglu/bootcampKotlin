package com.herpestes.bootcamp_kotlin

fun main() {
    calc(123, ConserveClass.ORTA)
}

fun calc(adet: Int, boyut: ConserveClass){
    when(boyut){
        ConserveClass.KUCUK -> println(adet*30)
        ConserveClass.ORTA -> println(adet*40)
        ConserveClass.BUYUK -> println(adet*50)
    }

}