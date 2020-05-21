package com.study.kotlin

class OverrideSample {

    open class Book(val title:String, var price:Int){
        open fun printInfo(){
            println("Title: $title, Price: $price")
        }
    }

    class EBook(title:String, price:Int, var url:String) : Book(title,price){
        override fun printInfo() {
            println("Title: $title, Price: $price, URL: $url")
        }
    }


}

fun main(args : Array<String>){
    var book = OverrideSample.Book("a", 200)
    var ebook = OverrideSample.EBook("b", 100, "http://a.com")
    book.printInfo()
    ebook.printInfo()
}