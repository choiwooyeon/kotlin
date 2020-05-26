package com.study.kotlin

class PropertySample {

    class Rectangle(var height : Int, var width : Int) {
        val isSquare : Boolean
        get() = height == width
    }
}

fun main(args : Array<String>) {
    val rect = PropertySample.Rectangle(10, 10)
    println("height: ${rect.height}, width : ${rect.width} isSqure : ${rect.isSquare}")
    rect.height = 11
    println("height: ${rect.height}, width : ${rect.width} isSqure : ${rect.isSquare}")
}
