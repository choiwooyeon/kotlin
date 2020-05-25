package com.study.kotlin

class interfaceSample3 {

    interface User {
        val nickname: String
    }

    class PrivateUser(override val nickname: String): User
    class SubscribingUser(val email: String): User {
        override val nickname: String = getID()
        fun getID() = email.substringBefore('@')
    }
}

fun main(args: Array<String>) {
    println(interfaceSample3.PrivateUser("Monguse").nickname)
    println(interfaceSample3.SubscribingUser("monguse@naver.com").nickname)
}