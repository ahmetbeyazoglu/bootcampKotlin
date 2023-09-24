package com.herpestes.bootcamp_kotlin.collections

fun main() {
    //definition
    val numbers = ArrayList<Int>()
    val fruits = ArrayList<String>()

    //data add
    fruits.add("Apple") //0.
    fruits.add("Banana") //1.
    fruits.add("cherry") //2.
    println(fruits)

    //update
    fruits[1] = "New Banana"
    println(fruits)

    //Insert
    fruits.add(1, "Orange") //adding 1. index to orange
    println(fruits)

    //read
    println(fruits[3])
    println(fruits.get(1))

    println(fruits.size)
    println(fruits.count())
    println(fruits.isEmpty())
    println(fruits.contains("cherry"))

    println(fruits.reverse())

    println(fruits.sort())

    for (fruit in fruits){
        println(fruit)
    }
    for ((indeks ,fruit) in fruits.withIndex()){
        println("$indeks. -> $fruit")
    }
    //println(fruits.remove(2))
    println(fruits.clear())




}