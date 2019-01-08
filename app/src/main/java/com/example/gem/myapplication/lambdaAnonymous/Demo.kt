package com.example.gem.myapplication.lambdaAnonymous

/*Lambda*/
//fun sum(x: Int, y: Int): Int {
//    return x + y
//}

//var sum = {x: Int, y: Int -> x + y}

var sum: (Int, Int) -> Int = {x, y -> x + y }

/*Anonymous*/
var name = fun (name: String) {
    println("Name: $name")
}

fun main(args: Array<String>) {
    println("Sum = ${sum(1, 2)}")

    name("Duan")

    var numList = arrayOf(5, 2, 3, 7, 5)
    numList.forEach { i -> run { print("$i, ") } }
    numList.forEach { i -> print("$i, ") }
}