package com.study.kotlin

class InterfaceSample2 {
    interface Clickable {
        fun click()
        fun showOff() = println("I'm clickable!")
    }

    interface Focusable {
        fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")
        fun showOff() = println("I'm Focusable!")
    }

    class Button:Clickable, Focusable {
        override fun click() {
            println("I was clicked.")
        }

        override fun showOff() {
            super<Clickable>.showOff()
            super<Focusable>.showOff()
        }
    }
}

fun main(args: Array<String>) {
    var button = InterfaceSample2.Button()
    button.click()
    button.setFocus(true)
    button.showOff()
}