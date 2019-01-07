package com.example.gem.myapplication.dataClasses

data class User(var name: String, var age: Int) {

}

fun main(args: Array<String>) {
    var user = User("Duan", 18)
    println("${user.toString()}")
    var backupUser = user.copy()
//    user.name = "Ha Anh"  /*Thay doi info cua user khong lam anh huong den backup user*/
    println("${backupUser.toString()}")
    println("${user.toString()}")
    println(backupUser.hashCode() == user.hashCode())
    println(backupUser.equals(user))
}