package com.study.kotlin

class Bitmap1(val width : Int, val heihgt:Int) {
    val size : Int
    get() = width * heihgt
    val map = ByteArray(size)
}

fun CreateBitmap1(width : Int, height: Int): Bitmap1? {
    if(width > 0 && height > 0) return Bitmap1(width, height)
    else return null
}

fun DrawBitmap(bitmap : Bitmap1) {
    println("DrawBitmap")
}

fun main(args:Array<String>){
    val bitmap:Bitmap1? = CreateBitmap1(10,10)
    bitmap?.let {
        DrawBitmap(it)
    }
}