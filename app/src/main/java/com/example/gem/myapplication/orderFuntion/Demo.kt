package com.example.gem.myapplication.orderFuntion

import java.util.*

class Lock {
    fun lock() {
        println("lock...")
    }
    fun unLock() {
        println("unlock...")
    }
}

var bodyFunction = fun(): Int {
    val taskId = Random().nextInt()
    println("Body funtion: TaskId = $taskId")
    return taskId
}

fun doTask(lock: Lock, body: () -> Int): Int {
    lock.lock()
    try {
        return body()
    }
    finally {
        lock.unLock()
    }
    return 0
}

val compare: (Int, Int) -> Boolean = {x, y -> x < y}
val compare2 = {a: Int, b: Int -> a < b}

fun getMaxValue(collection: Collection<Int>, less: (Int, Int) -> Boolean): Int? {
    var max: Int? = null
    for (item in collection)
        if (max == null || less(max, item))
            max = item
    return max
}

fun main(args: Array<String>) {
    doTask(Lock(), bodyFunction)

    println()
    var list: Collection<Int> = listOf(1, 5, 2, 7, 3, 5)
    var maxValue = getMaxValue(list, compare)
    println("$maxValue")
}