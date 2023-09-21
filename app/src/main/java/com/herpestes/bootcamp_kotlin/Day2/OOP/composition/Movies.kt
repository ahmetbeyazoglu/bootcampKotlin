package com.herpestes.bootcamp_kotlin.Day2.OOP.composition

data class Movies(
    var film_id: Int,
    var film_ad: String,
    var film_yil: Int,
    var kategori: Category, //compositon burada devreye giriyor diğer 2 tablodan foreign key yapısını çekiyor
    var yonetmen: Directors
) {


}