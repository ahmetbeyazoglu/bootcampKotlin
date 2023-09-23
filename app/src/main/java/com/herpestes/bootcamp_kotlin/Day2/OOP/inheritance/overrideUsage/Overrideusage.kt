package com.herpestes.bootcamp_kotlin.Day2.OOP.inheritance.overrideUsage

fun main() {
    val animal = Animal()
    val mamals = Mamals()
    val cat = Cat()
    val dog = Dog()


    animal.isvoice() //kalıtım yok kendi sınıfına erişti
    mamals.isvoice() //kendi içindeki fonksiyona bakar yoksa üst sınıfı kullanır. Kalıtım var
    cat.isvoice()
    dog.isvoice()

}