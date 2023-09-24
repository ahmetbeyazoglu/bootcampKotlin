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

    //sort
    println("Numerical: Asc to Dsc")
    val sort1 = studentsList.sortedWith(compareBy { it.no })
    for(o in sort1){
        println("${o.no} - ${o.name} - ${o.sinif}")
    }

    println("Numerical: Dsc to Asc")
    val sort2 = studentsList.sortedWith(compareBy { it.no })
    for(o in sort2){
        println("${o.no} - ${o.name} - ${o.sinif}")
    }
    println("Name: Dsc to Asc")
    val sort3 = studentsList.sortedWith(compareBy { it.name })
    for(o in sort3){
        println("${o.no} - ${o.name} - ${o.sinif}")
    }


    //Filtering

    println("Filter 1")
    val filter1 = studentsList.filter { it.no > 150 }
    for(o in filter1){
        println("${o.no} - ${o.name} - ${o.sinif}")
    }
    println("Filter 2")
    val filter2 = studentsList.filter { it.name.contains("y") }
    for(o in filter2){
        println("${o.no} - ${o.name} - ${o.sinif}")
    }
}