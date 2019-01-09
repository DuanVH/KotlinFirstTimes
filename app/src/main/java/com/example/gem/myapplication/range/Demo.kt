package com.example.gem.myapplication.range

fun main(args: Array<String>) {
    println("1 -> 10: ")
    for (i in 1..10)
        print("$i, ")

    println()
    println("10 -> 1: ")
    for (i in 10 downTo 1)
        print("$i, ")

    println()
    println("1 -> 10: ")
    for (i in 1 until 11)
        print("$i, ")

    println()
    val nums: List<Int> = listOf(1, 2, 3, 4, 9, 10, 5, 2, 3)
    if (2 in nums)
        println("nums contain 2")
    else  /*!in*/
        print("not contain")


    println()
    println("Step")
    for (i in 1..20 step 3)
        print("$i ")

    println()
    for (i in 20 downTo 1 step 3)
        print("$i ")

    println()
    var newList = (1..20 step 3)
    for (item in newList)
        print("$item ")

    println()
    println("Filter")

}