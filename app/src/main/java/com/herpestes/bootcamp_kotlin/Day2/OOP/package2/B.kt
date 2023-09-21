package com.herpestes.bootcamp_kotlin.Day2.OOP.package2

import com.herpestes.bootcamp_kotlin.Day2.OOP.package1.A

class B: A() {

    fun function(){
        //val nesne = A()
        //println(nesne.varsayilanDegisken)
        println(varsayilanDegisken)
        println(publicDegisken)
        println(internalDegisken)
        println(protectedDegisken)
    }
}