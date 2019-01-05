package com.example.gem.myapplication

import android.util.Log

fun main(args: Array<String>) {
    println("Hello Maboy")
    var x: Double = 3.15  /*Thay doi duoc*/
    x = 9.13
    val a: Int = 4
    val b = 123_123_534_123_345L /*val b: Long = 123_123_534_123_345*/

    println("x = $x")
    println("a = $a")
    println("b = $b")

    /*Khi chung ta khai bao thi khong can gan gia tri ngay*/
    var number: Int?
    number = 123

    /*convert
    * convert thanh gi thi to?()*/
    number = b.toInt()

    /*convert chuoi so thanh so*/
    var s: Float = "123.123".toFloat()

    /* == so sanh gia tri
    * === so sanh dong nhat (gia tri bang nhau, vung nho giong nhau ???)*/

    var z = 10
    var y = 10
    var w = z
    println(w === z)


    /*-------------------------------------------------------------------*/
    /*Characters (Char)''
    * chi chua 1 ki tu duy nhat
    * utf-8 character set Google Search (1 so ki tu dac biet)*/
    var c: Char = 'd'

    /*String*/
    var name = "Maboy"
    /*lay ra tung ki tu trong xau su dung vong for*/
    for (t in name)
        println("eachChar = $t")

    var nameList: Array<String> = arrayOf("Duan", "Thang", "Ha", "Anh")
    for (item in nameList)
        println("name: $item")

    /*Su dung ham No Name*/
    var numberList: Array<Int> = Array<Int>(5, { i -> 2 * i })
    for (num in numberList)
        println("i: $num")

    /*trimMargin("?") to delete ?*/


    /*-------------------------------------------------------------------*/
    /*if; when; for; while
    * when giong nha switch case*/
    var a1 = 2
    var b1 = 3
    var demo = if (a1 > b1) "duan" else "ha"

    /*when*/
    c = 'u'
    var stringResults: String = when (c) {
        'u' -> "Duan"
        'v' -> "Ha Anh"
        else -> "other character"
    }
    println("c: $stringResults")

    fun checkNumber(num: Int) = when (num) {
        1 -> {
            println("Ahihi")
            println("Ahihi")
            println("Ahihi")
        }
        in 3..10 -> println("Do ngoc")
        else -> {
            println("Stupid!")
        }
    }
    checkNumber(3)

    /* for loop*/
    var intNumbers: Array<Int> = arrayOf(1, 2, 4, 8, 9, 4)
    for (num in intNumbers)
        println(num)
    /*indices: chi so*/
    for (index in intNumbers.indices)
        println("i = $index -> intNumbers[$index] = ${intNumbers[index]}")
    /*using index, value*/
    for ((index, value) in intNumbers.withIndex())
        println("Value at index = $index is $value")

    /*-------------------------------------------------------------------*/
    /*return, continue, break
    * break .. nhay ra khoi vong lap
    * continue .. bo qua buoc hien tai va nhay sang buoc tiep theo
    * return .. */
    labelOne@ for (i in 1..3) {
        labelTwo@ for (j in 1..3) {
            if (i == 2 && j == 2) {
                break@labelOne  /*break ra ca 2 vong lap*/
//                break@labelTwo  /*break ra khoi vong for thu 2 va van tiep tuc vong for thu nhat va cac lenh ben trong vong for thu nhat*/
            }
            println("i = $i, j = $j")
        }
    }
    fun printIntegerList(integerNumber: Array<Int>) {
        intNumbers.forEach(fun(item: Int) {
            if (item == 4) return  /*return ve ham nac danh (fun(item: Int)*/
            println("item = $item")
        })
    }
    printIntegerList(intNumbers)


    /*-------------------------------------------------------------------*/
    /*Khai bao va su dung ham*/
    fun sum(x: Int, y: Int = x): Int {  /*Neu khong truyen vao gia tri cho y thi lay y = x*/
        return x + y
    }
    println("${sum(2, 3)}")

    fun funA(vararg intParams: Int) {  /*vararg: thong so dau vao co the nhieu or it, chua biet truoc (1 so, 1 mang ...)*/
        for (item in intParams) {
            println("item: $item")
        }
    }
    funA(1)
    funA(1, 2, 3, 45)

    /*Bieu thuc Trung to*/
    infix fun Int.plus(x: Int): Int {
        return this + x  /*this la toan hang dau tien; x la toan hang tiep theo*/
    }
    println("3 + 2 + 1 = ${3 plus 2 plus 1}")

    /*tailrec: danh cho cac ham de quy; neu khong co dieu kien dung thi no se tu dong break
    * or khi so vong lap qua nhieu ma may tinh khong the tinh the no se break luon*/
    tailrec fun factorial(n: Long = 1): Long {  /*Neu khong truyen vao gia tri n thi n = 1*/
        if (n == 1L) {
            return n
        } else {
            return n * factorial(n - 1)
        }
    }
    println("Giai thua: ${factorial(4)}")
}
