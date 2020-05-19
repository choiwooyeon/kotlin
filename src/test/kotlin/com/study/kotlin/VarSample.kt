package com.study.kotlin

class VarSample
    class Person(
            val name: String,
            var age: Int
    )

    fun main(args: Array<String>){
        val person = Person("aaa", 10)

        //person.name="bbb" //ERROR 변경 불가
        person.age = 15

        println(person.name)
        println(person.age)
    }
