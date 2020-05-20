package com.study.kotlin

class InitBrockSample1
    class Button1(var id: Int) {
        var text: String = ""
        //1.초기화블록
        init {
            println("Initializer Block : $id, $text")
        }
        //2. 부생성자, 반드시 주 생성자를 호출해주어야 한다.
        constructor(id: Int, text: String) :this(id) {
            this.text = text
            println("constructor(id, text) : ${this.id}, ${this.text}")
        }
    }

    fun main(args: Array<String>) {
        var button1 = Button1(100)
        var button2 = Button1(101,"Button2")
    }
