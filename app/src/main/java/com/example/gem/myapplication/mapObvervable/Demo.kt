package com.example.gem.myapplication.mapObvervable

import kotlin.properties.Delegates

class User(name: String) {
    var currentAddress: String by Delegates.observable("No address") { property, oldValue, newValue ->
        run {
            println()
            println("prop: ${property.name}")
            println("oldValue: $oldValue")
            println("newValue: $newValue")
        }
    }
}

var userObject = mutableMapOf<String, Any?>("name" to "Vu Huu Duan", "age" to "18")

class CustomUser(val mapObject: Map<String, Any?>) {
    val name: String by mapObject
    val age: String by mapObject
}

fun main(args: Array<String>) {
    var user = User("duan")
    user.currentAddress = "Thai Binh"
    user.currentAddress = "Ha Noi"

    println()
    userObject.set("age", "20")
    println("${userObject.getValue("name")}")
    println("${userObject.getValue("age")}")

    println()
    var customUser = CustomUser(mapOf("name" to "Maboy", "age" to "20"))
    println("Name: ${customUser.mapObject.getValue("name")}, age: ${customUser.mapObject.getValue("age")}")
}