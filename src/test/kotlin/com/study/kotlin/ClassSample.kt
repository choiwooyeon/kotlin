package com.study.kotlin

class ClassSample
    //매개변수 없는 주 생성자
    /*class Button{
        var id:Int=0
    }*/

    //매개변수 있는 주 생성자
    class Button(var id:Int, val x:Int=0, val y:Int=0)

    // 객체를 생성할 때 new 키워드를 사용하지 않음
    fun main(args:Array<String>){
        //매개 변수 없는 주 생성자 사용시
        /*
        // val button: Button = Button() //button변수의 타입추론 가능,:Button 구문 생략가능
        val button = Button();
        button.id = 100
        println(button.id)
        */

        //매개 변수 있는 주 생성자 사용시
        val button1 = Button(100)
        val button2 = Button(101,10,10)

        //println()구문에서 변수 값 출력시 $문자 사용
        // 문자열에 함수 또는 식을 포함시${}사용
        println("button1 : ${button1.id} (${button1.x},${button1.y})")
        println("button2 : ${button2.id} (${button2.x},${button2.y})")
    }
