package com.herpestes.bootcamp_kotlin.advanced

fun main() {

    //1. compile error
    val x = 10
    //x = 300

    //2. exception: Runtime error

    val a = 10
    val b = 0

    println(a/b)

    try {
        println(a/b)
    }catch (e: java.lang.Exception){
        println("İkinci sayı 0 olamaz")
    }

}