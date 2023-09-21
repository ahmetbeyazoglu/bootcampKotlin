package com.herpestes.bootcamp_kotlin.Day2.OOP

class Func {
    //void - no value returns
    fun greetings(){
        val result = "Ahmet"
        println(result)
    }

    //return
    fun greetings2(): String{
        val result = "Ahmet"
        return result
    }

    //parameter
    fun greetings3(name: String){
        val result = "Merhaba $name"
        println(result)
    }

    //overloading

    fun carp(s1: Int, s2: Int){
        println(s1*s2)

    }
    fun carp(s1: Double, s2: Int){
        println(s1*s2)

    }


}