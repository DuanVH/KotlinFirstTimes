package com.example.gem.myapplication.nullNotNullElvis

fun main(args: Array<String>) {
    var s: String? = "duan"
    s = null
    var len = s?.length ?: -1  /*elvis*/
    println(len)
}