package com.example.gem.myapplication.extensions

class CompanionDemo {
    companion object {
        fun PI(): Float = 3.14F
    }
}

// Extensions with Companion
fun CompanionDemo.Companion.doublePi(): Float {
    return CompanionDemo.Companion.PI() * 2
}