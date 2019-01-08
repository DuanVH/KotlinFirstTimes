package com.example.gem.myapplication.enumClass

enum class CompassDirection {
    EAST,
    NORTH,
    SOUTH,
    WEST
}

enum class Color(var red: Int, var green: Int, var blue: Int) {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255)
}

enum class ActionState {
    ACTIVE {
        override fun reverseAction() = INACTIVE
    },
    INACTIVE {
        override fun reverseAction() = ACTIVE
    };
    abstract fun reverseAction(): ActionState
}

fun main(args: Array<String>) {
    println("Compass is ${CompassDirection.WEST}")
    println("Name: ${Color.RED.toString()}")
    println("Name: ${Color.GREEN.ordinal}")
    println("Ordinal: ${Color.GREEN.name}")
    println("${Color.valueOf("BLUE")}")  /*Co ton tai gia tri BLUE hay ko?*/
    println("Array: ${CompassDirection.values().size}")
    for (item in Color.values())
        println("${item.name}")
    println(ActionState.ACTIVE.reverseAction())  /*INACTIVE*/
    println(ActionState.INACTIVE.reverseAction())  /*ACTIVE*/
}