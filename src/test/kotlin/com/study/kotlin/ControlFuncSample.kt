package com.study.kotlin

//if 함수
fun GetMax(a:Int, b:Int) : Int = if(a<b) b else a
fun GetMax1(a : Int, b: Int) : Int {
    return if(a<b) {
        println("b bigger than a")
        b
    } else {
        println("a bigger than b")
        a
    }
}

// when 함수
fun printValue(a : Int) {
    when (a) {
        1 -> println("value : 1")
        2 -> println("value : 2")
        else -> println("value is neither 1 nor 2")
    }
}

fun printValue1(a: Int){
    when (a) {
        1,2 -> println("value 1 or 2")
        else -> println("value is neither 1 nor 2")
    }
}

fun printValue2(a: Int, str:String){
    when(a) {
        str.toInt() -> println("str is a")
        else-> println("str is nor a")
    }
}

fun printValue3(a : Int){
    when(a) {
        in 1..10 ->println("a is in the range (1~10)")
        in 10..20->println("a is outside the range")
        else -> println("none of the above")
    }
}

fun hasPrefix(x : Any) = when(x) {
    is String -> x.startsWith("prefix")
    else ->false
}
fun Int.isOdd() = if(this%2 == 0) true else false
fun Int.isEven() = if(this%2 == 0) false else true

fun checkValue(a: Int){
    when {
        a.isOdd() -> println("$a is odd")
        a.isEven() -> println("$a is even")
        else -> println("$a is funny")
    }
}
fun main(args : Array<String>){
    //if 함수 테스트
    println(GetMax(1,2))
    println(GetMax1(1,2))
    //when 함수 테스트
    printValue1(1)
    printValue1(2)
    printValue1(3)

    printValue2(10,"10")
    printValue2(10, "20")

    printValue3(10)

    println(hasPrefix("prefix-123"))

    checkValue(10)
}