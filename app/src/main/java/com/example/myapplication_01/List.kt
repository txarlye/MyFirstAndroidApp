package com.example.myapplication_01

import kotlin.collections.List

 fun main(){

 }

fun readonlyList(){
    val readOnly:List<String> = listOf("Lunes","Martes","Miercoles","jueves")
    println(readOnly.size)
    println(readOnly)

    println(readOnly.last())

    readOnly.forEach { weekDay -> println(weekDay) }
}