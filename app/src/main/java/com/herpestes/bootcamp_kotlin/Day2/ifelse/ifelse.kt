package com.herpestes.kotlin.Day2.ifelse

fun main() {
    val a = 40
    val b = 50



    println("a == b : ${a ==b}")
    println("a != b : ${a != b}")
    println("a > b : ${a > b}")
    println("a >= b : ${a >= b}")
    println("a < b : ${a < b}")
    println("a <= b : ${a <= b}")

    if(a < b){
        println("a değeri b değerinden küçüktür")
    }else{
        println("b değeri a değerinden küçüktür")
    }

    when(a){
        a -> println("a")
        b -> println("b")
        else -> println("boş")
    }//

}