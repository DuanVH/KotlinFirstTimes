package com.example.gem.myapplication

//class Person constructor(val firstName: String, val lastName: String, var age: Int?) {
open class Person(var firstName: String, var lastName: String, var age: Int?) {
    /*Neu khai bao var or val thi co the call truc tiep bang cach person.firstName ...
    * nguoc lai thi khong the...
    * nhung khong khai bao var or val thi van co run ok*/

    private var fullName: String = firstName + " " + lastName
    var isMarried: Boolean
        get() {
            if (age == null)
                return false
            else
                return true
        }
        set(value) {
            age = if (value) 20 else null
        }

    lateinit var language: String

    var isEmpty: String = "Duan"
        get() {
            return field
        }
//        get() = field  /*2 cach viet tuong tu nhau*/
        set(value) {
            field = value
        }

    init {
        println("${this.firstName} $lastName $age")
    }

    fun name() {
        println("Fullname: $fullName")
    }


}

class Employee(var skill: String, firstName: String, lastName: String, age: Int?) : Person(firstName, lastName, age) {
    fun talk(): String {
        return firstName + " " + lastName + " " + skill
    }
}

fun main(args: Array<String>) {
//    var person = Person("Vu", "Duan", null)
//    println("${person.firstName + " " + person.lastName + " " + person.age}")
//    person.name()

    /*------------------Ke thua-----------------------*/
    var employee = Employee("android", "Ha", "Anh", null)
    println("${employee.talk()}")

    /*-----------------Getter Setter-----------------*/
//    println("Getter: ${person.isMarried}")
//    person.isMarried = true
//    println("${person.isMarried}")
//    person.language = "English"
//    println("${person.language}")
//    person.isEmpty = "Ha Anh"
//    println("${person.isEmpty}")

}