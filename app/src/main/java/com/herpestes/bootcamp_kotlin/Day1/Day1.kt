package com.herpestes.kotlin.Day1

fun main() {
    //variable

    var studentName: String = "Ahmet"
    var studentAge :  Int = 24
    var studentSize= 1.87
    var firstLetter = 'A'
    var studentStatus = true

    println(studentName)
    println(studentAge)
    println(studentSize)
    println(firstLetter)
    println(studentStatus)

    //Const
    //val(kotlin) - let(swift) - final(java)//

    var n1 = 30
    println(n1)
    n1 = 100
    println(n1)

    val n2 = 40
    println(n2)
    // n2 = 80 //it cannot be changed


    //Type Casting
    val i = 42
    val d = 78.52

    val result1 = i.toDouble()
    val result2 = d.toInt()
    println(result1)
    println(result2)

    val result3 = i.toString() // "42"
    val result4 = d.toString() // "78.52"
    println(result3)
    println(result4)

    val word = "67.42"

    val result5 = word.toDouble()
    println(result5)
}