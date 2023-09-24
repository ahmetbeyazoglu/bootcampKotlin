package com.herpestes.bootcamp_kotlin.collections

fun main() {
    //Dictionary
    val cities = HashMap<Int, String>()

    cities.put(16, "Bursa")
    cities.put(34, "İstanbul")
    cities[6] = "Ankara"
    println(cities)

    println(cities.get(16))
    cities.put(16, "Yeni bursa")

    for ((key, value) in cities){
        println("$key -> $value")
    }
    cities.remove(34)
    cities.clear()


}