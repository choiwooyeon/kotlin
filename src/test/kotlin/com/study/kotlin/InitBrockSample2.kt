package com.study.kotlin

class InitBrockSample2
    class Button2 {
        var id: Int = 0
        var text: String = ""
        //1.초기화블록은 부 생성자 호출 전에 순차적으로 실행된다.
        init {
            println("Initializer Block 1: $id, $text")
        }
        constructor(id: Int)  {
            this.id = id
            println("constructor(id, text) : ${this.id}, ${this.text}")
        }
        init {
            println("Initializer Block 2: $id, $text")
        }

        constructor(id: Int, text: String) :this(id) {
            this.text = text
            println("constructor(id, text) : ${this.id}, ${this.text}")
        }
        init {
            println("Initializer Block 3: $id, $text")
        }
    }

    fun main(args: Array<String>) {
        var button2 = Button2(100, "Button")
    }
