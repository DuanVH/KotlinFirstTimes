package com.example.gem.myapplication

//class Person constructor(val firstName: String, val lastName: String, var age: Int?) {
open class Person(var firstName: String, var lastName: String, var age: Int?) {
    /*Neu khai bao var or val thi co the call truc tiep bang cach person.firstName ...
    * nguoc lai thi khong the...
    * nhung khong khai bao var or val thi van co run ok*/

    private var fullName: String = firstName + " " + lastName

    init {
        println("${this.firstName} + $lastName + $age")
    }

    fun name() {
        println("Fullname: $fullName")
    }
}

class Employee(var skill: String, firstName: String, lastName: String, age: Int?) : Person(firstName, lastName, age) {

}

fun main(args: Array<String>) {
    var person = Person("Vu", "Duan", null)
    println("${person.firstName + " " + person.lastName + " " + person.age}")
    person.name()
}