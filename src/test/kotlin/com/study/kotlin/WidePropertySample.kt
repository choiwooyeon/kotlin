package com.study.kotlin

class Calculator {
    var lastResult : Int = 0

    fun sum(a:Int, b:Int) : Int {
        lastResult = a+b
        return lastResult
    }

    fun minus(a:Int, b:Int) : Int {
        lastResult = a-b
        return lastResult
    }
}

val Calculator.signResult : Char
    get() = if(lastResult<0) '-' else '+'

fun main(args:Array<String>){
    val calc = Calculator()
    println("minus(1,2) = ${calc.minus(1,2)} (${calc.signResult})")
}