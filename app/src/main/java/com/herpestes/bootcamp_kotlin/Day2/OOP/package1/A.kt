package com.herpestes.bootcamp_kotlin.Day2.OOP.package1

open class A {

    var varsayilanDegisken = 1 // heryerden
    public var publicDegisken = 2 // heryerden
    private var privateDegisken = 3 //sadece class
    internal var internalDegisken = 4 //modul yapılarında
    protected var protectedDegisken = 5 // inheritance ile kullanılır

    fun fonksiyon(){
        println(privateDegisken)
    }
}