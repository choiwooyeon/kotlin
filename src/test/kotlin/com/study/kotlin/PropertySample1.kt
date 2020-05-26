package com.study.kotlin

class LengthCounter {
    var counter : Int = 0
    private set

    fun addWord(word: String) {
         counter += word.length
    }
}

fun main(args:Array<String>){
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("wooyeon")
    println(lengthCounter.counter)
}