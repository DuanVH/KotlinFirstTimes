package com.example.gem.myapplication.nesterdInnerClass

class Fruit {
    private var watermelon: String = "🍉"
    private var strawberry: String = "🍓"
    private var apple: String = "🍎"
    private var bear: String = "🍐"
    public var cherry: String = "🍒"

    fun f() {
        println("$strawberry")
    }

    class Nested {
        fun sayHello() {
            /*Ko the truy cap duoc thuoc tinh ben ngoai*/
            println("funtion in nested class")
        }
    }

    inner class Inner {
        fun getEmoji() {
            println("$watermelon")
            f()
        }
    }
}

fun main(args: Array<String>) {
    Fruit.Nested().sayHello()
    var fruit = Fruit()
    fruit.Inner().getEmoji()

    var innerFruit = fruit.Inner()
    innerFruit.getEmoji()
}