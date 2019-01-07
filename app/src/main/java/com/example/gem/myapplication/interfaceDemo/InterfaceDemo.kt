package com.example.gem.myapplication.interfaceDemo

class Bat : AnimalInterface, BirdInterface {
    override fun eat() {
        super<BirdInterface>.eat()
        super<AnimalInterface>.eat()
    }

    override fun walk() {
//        super.walk()
        println("Bat walk")
    }

    override fun fly() {
        super.fly()
    }
}

fun main(args: Array<String>) {
    var bat = Bat()
    bat.walk()
}