package com.example.gem.myapplication.accessModifier.package1

class ClassA {
    init {
        println("This is Class A")
    }
}

public fun fun1() {
    println("This is fun1")
}

internal fun fun2() {
    println("This is fun2")
}

private fun fun3() {
    println("This is fun3")
}

private var x = 100