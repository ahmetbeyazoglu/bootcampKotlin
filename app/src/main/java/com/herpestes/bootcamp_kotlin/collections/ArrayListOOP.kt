package com.herpestes.bootcamp_kotlin.collections

fun main() {

    val o1 = students(200, "Zeynep", "9C")
    val o2 = students(100, "Ali", "12C")
    val o3 = students(300, "Ahmet", "10C")

    val studentsList = ArrayList<students>()

    studentsList.add(o1)
    studentsList.add(o2)
    studentsList.add(o3)

    for(o in studentsList){
        println("${o.no} - ${o.name} - ${o.sinif}")
    }


}