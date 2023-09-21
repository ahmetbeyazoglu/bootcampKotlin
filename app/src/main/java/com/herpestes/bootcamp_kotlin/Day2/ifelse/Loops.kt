package com.herpestes.kotlin.Day2.ifelse

fun main() {
    for(i in 1 ..3){
        print(i)
    }
    for (a in 10..20 step 5){
        println(a)
    }
    for (b in 20 downTo  10 step 5){
        println(b)
    }

    var sayac = 1
    while (sayac<6){
        println("$sayac")
        sayac++//

    }
}