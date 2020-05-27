package com.study.kotlin

class DataclassSample {
    data class Client(val name:String, val postalcode:Int)
}

fun main(args : Array<String>) {
    val client1 = DataclassSample.Client("wooyeon", 1234)
    val client2 = client1.copy(postalcode = 1235)
    println(client1)
    println(client2)
}