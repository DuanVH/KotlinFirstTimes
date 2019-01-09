package com.example.gem.myapplication.listSetMap

fun main(args: Array<String>) {
    val numbers: MutableList<Int> = mutableListOf(1, 3, 3, 10, 7)
    val readOnlyNumbers: List<Int> = numbers
    println()
    println("numbers: $numbers")
    println("readOnlyNumbers: $readOnlyNumbers")

    println()
    numbers.add(4)
    println("numbers: $numbers")
    println("readOnlyNumbers: $readOnlyNumbers")


    /*Kiem tra phan tu co chua trong list ko*/
    println()
    if (numbers.contains(0))
        println("True")
    else
        println("False")

//    var strings = mutableSetOf("d", "a", "k", "b")
    var strings = mutableSetOf(10, 2, 5, 1)
    println()
    strings.sortedDescending()
    println(strings.reversed())

    println()
    println("List origin: $numbers")
    val backupList: List<Int> = numbers.toList()
    println("List backup: $backupList")
    numbers.add(5)
    println("List origin: $numbers")
    println("List backup: $backupList")
    println("First item: ${numbers.first()}")
    println("Last item: ${numbers.last()}")

    println()
    println("Filter: ...?")
    /**/
    val f: List<Int> = numbers.filter { item -> item > 3 }
    println("$f")

    println()
    val listWithNullElement: MutableList<Int?> = mutableListOf(1, 8, 7, null, 2, 9)
    println("$listWithNullElement")
    println(listWithNullElement.filterNotNull())  /*loai bo phan tu null trong list*/
//    listWithNullElement.requireNoNulls()  /*ban ra exception neu trong list co phan tu null*/

    println()
    var mutableHashMap = mutableMapOf<String, Int>("x" to 1, "y" to 2, "z" to 3)  /* key -> value */
    println("${mutableHashMap.values}")
    mutableHashMap["x"] = 10
    println(mutableHashMap.values)
    mutableHashMap.set("y", 20)
    println(mutableHashMap.values)
}
