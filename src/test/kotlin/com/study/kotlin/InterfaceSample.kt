package com.study.kotlin

class InterfaceSample {
    interface Clickable {
        fun click()
        fun showOff() = println("I'm clickable!")
    }

    class Button:Clickable {
        override fun click() {
            println("I was clicked.")
        }
    }
}

fun main(args: Array<String>) {
    var button = InterfaceSample.Button()
    button.click()
    button.showOff()
}