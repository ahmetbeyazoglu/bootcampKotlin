package com.herpestes.bootcamp_kotlin.collections

fun main() {
    val fruits = HashSet<String>() //içeriği değiştiriyor
    fruits.add("Banana")
    fruits.add("Cherry")
    fruits.add("Apple")

    println(fruits)

    println(fruits.elementAt(1))
    println(fruits.size)
    println(fruits.isEmpty())

    for(f in fruits){
        println(f)
    }


}