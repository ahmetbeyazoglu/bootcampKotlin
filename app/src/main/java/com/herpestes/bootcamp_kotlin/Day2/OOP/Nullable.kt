package com.herpestes.bootcamp_kotlin.Day2.OOP

fun main() {
    //nullable - null safety - optional(swift)

    var x = "Merhaba"

    //Definition
    var str:String? = null

    //type - 1
    println("Type 1: ${str?.trim()}")
    //type - 2
    println("Type 2: ${str!!.trim()}") //null olmayacak olduğunu söylüyoruz.
    //type - 3
    if(str != null){
        println("Type 3: ${str.trim()}")
    }else{
        println("Sonuç null")
    }
    //type - 4
    str?.let {
        println("type - 4: ${str.trim()}")
    }



}