package com.example.gem.myapplication.destructuringDeclarations

data class Customer(var name: String, var age: Int) {

}

/* function return multiple values*/
data class Result(var x: Int, var y: Int, var z: Int) {

}

fun calculationVector(x: Int, y: Int, z: Int): Result {
    return Result(x, y, z)
}

fun main(args: Array<String>) {
    var c = Customer("Duan", 18)
    var (name, age) = c  /*Trich xuat thuoc tinh cua customer*/
    println()
    println("Name: $name, age: $age")

    println()
    var c2 = Customer("Ha Anh", 20)
    var listCustomer = listOf<Customer>(c, c2)
    for ((name, age) in listCustomer)
        println("$name, $age")

    println()
    var (x, y, z) = calculationVector(1, 2,3)
    println("x: $x, y: $y, z: $z")

    // Map
    println()
    var userObject = mapOf<String, Any?>("name" to "Duan", "age" to 20)
    for ((key, value) in userObject)
        println("key: $key, value: $value")
}