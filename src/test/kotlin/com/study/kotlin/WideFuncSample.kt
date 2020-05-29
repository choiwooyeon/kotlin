package com.study.kotlin

class WideFuncSample {
    class Calculator {
        fun sum(a:Int, b:Int) = a+b
        fun minus(a:Int, b:Int) = a-b
    }

}

fun WideFuncSample.Calculator.sum(a: Int, b: Int, c: Int) = sum(a,b) + c
fun WideFuncSample.Calculator.minus(a: Int) = -a


fun main(args:Array<String>){
    val calc = WideFuncSample.Calculator()
    println("1+2+3 = ${calc.sum(1,2,3)}")
    println("1 = ${calc.minus(1)}")
}