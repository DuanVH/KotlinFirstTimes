package com.example.gem.myapplication.accessModifier.package2

import com.example.gem.myapplication.accessModifier.package1.ClassA

public open class ClassD {
    protected open var name: String = "Maboy"
    init {
        println("This is Class D")
    }
}

class SubClassD: ClassD() {
    override var name = "VuHuuDuan"
}

public fun fun4() {
    println("This is fun4")
    var a = ClassA()
}