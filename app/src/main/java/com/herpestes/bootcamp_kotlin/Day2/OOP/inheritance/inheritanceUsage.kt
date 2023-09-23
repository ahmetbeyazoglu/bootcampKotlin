package com.herpestes.bootcamp_kotlin.Day2.OOP.inheritance

fun main() {

    val topkapi = Castle(5, 300)
    val bosphorus = DeluxHome(true,10)

    println(topkapi.tower)
    println(topkapi.windowNumber)

    println(bosphorus.garage)
    println(bosphorus.windowNumber)


    if(topkapi is Castle){
        println("Yes")
    }else{
        println("No")
    }

    //upcasting

    val home:Home = bosphorus

    //downcasting

    val home1 = Home(7)
    val palace = home1 as Castle


}