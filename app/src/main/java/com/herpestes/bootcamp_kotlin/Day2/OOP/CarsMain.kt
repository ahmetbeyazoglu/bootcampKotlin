package com.herpestes.kotlin.Day2.OOP

fun main() {
    //creating object

    val bmw = Cars("blue", 150,true)
    bmw.takeinfo()
    bmw.stop()
    bmw.run()
    bmw.takeinfo()
    bmw.speedd(50)
    bmw.takeinfo()
    bmw.slow(20)
    bmw.takeinfo()//

    val sahin = Cars("white", 100, true)
    sahin.takeinfo()
}