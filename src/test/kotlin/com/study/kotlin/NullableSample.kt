package com.study.kotlin

class Bitmap(val width:Int, val height:Int){
    val size: Int
    get() = width*height
    val map = ByteArray(size)
}

fun CreateBitmap(width: Int, height:Int):Bitmap?{
    if (width>0 && height>0) return Bitmap(width, height)
    else return null
}

class Address(val st: String, val zipCode: Int, val city: String)
class Company(val name: String, val addr:Address?)
class Person1(val name: String, val company: Company?)

fun Person1.cityName() : String {
   // val city = this.company?.addr?.city
    //return if(city!= null) city else "Unkown"
    //엘비스 연산자
    //return city?:"Unkown"
    //압축
    return this.company?.addr?.city?:"Unkown"

}
//더 줄이면
//fun Person1.cityName():String=this.company?.addr?.city:"Unkown"

fun main(args:Array<String>){

    val bitmap: Bitmap? = CreateBitmap(10,10)
   // if(bitmap != null) println(bitmap.size)
    // 동일 의미
    println(bitmap?.size)

    val person = Person1("wooyeon", null)
    println(person.cityName())
}