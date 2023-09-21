package com.herpestes.bootcamp_kotlin.Day2.OOP.composition

fun main() {
    val k1 = Category(1, "Dram")
    val k2 = Category(2, "bilim kurgu")

    val y1 = Directors(1,"Nolan")
    val y2 = Directors(2,"Tarantino")

    val f1 = Movies(1, "Django", 2013, k1, y1)
    // Composition yapısı tam olarak burada kullanılmakta türü ve yönetmeni için yukarıda oluşturduğumuz değişkenleri yazdık
    println("Film id: ${f1.film_id}")
    println("Film ad: ${f1.film_ad}")
    println("Film yil: ${f1.film_yil}")
    println("Film kategori: ${f1.yonetmen.yonetmen_id}")
    println("Film yönetmen: ${f1.yonetmen.yonetmen_ad}")


}