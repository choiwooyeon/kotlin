package com.study.kotlin

class ClassSample
    class Button{
        var id:Int=0
    }

    // 객체를 생성할 때 new 키워드를 사용하지 않음
    fun main(args:Array<String>){
        // val button: Button = Button() //button변수의 타입추론 가능,:Button 구문 생략가능
        val button = Button();
        button.id = 100
        println(button.id)
    }
