package com.herpestes.bootcamp_kotlin.Day2.OOP.interfaceUsage

class ClassA: MyInterface {
    override val degisken: Int = 10


    override fun metod1() {
        println("Metod1 çalışt")
    }

    override fun metod2(): String {
        return "metod2 çalıştı"
    }


}