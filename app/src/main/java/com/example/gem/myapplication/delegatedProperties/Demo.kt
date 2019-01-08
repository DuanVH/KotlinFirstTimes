package com.example.gem.myapplication.delegatedProperties

import kotlin.reflect.KProperty

class User {
    var name: String by DelegatedUser()
}

class DelegatedUser {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "ThisRef: $thisRef, name: ${property.name}"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("assigned to ${property.name} in $thisRef, Details: $value")
    }
}

fun main(args: Array<String>) {
    var user = User()
    println("${user.name}")  /*Getter*/
    user.name = "Vu Huu Duan"  /*Setter*/
    println("${user.name}")
}