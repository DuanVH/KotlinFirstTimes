package com.example.gem.myapplication.extensions

class A {
    fun fA1() {
        println("fA1")
    }

    fun fAB() {
        println("fAB of A")
    }

    /* fun nay co the goi duoc ca fun cua class A va class B
    * fun nay la extensions cua classB
    * nen khi call method cung ten giua 2 class thi no se uu tien method cua classB (class ma no mo rong)*/
    fun B.methodB2() {
        fA1()
        this.fB1()  /*this <=> classB*/
        fAB()  /*Trong truong hop nay thi se goi method fAB() cua classB*/
        this@A.fAB()  /*call funAB() of classA*/
    }

    fun callB2FromA(b: B) {
        b.methodB2()
    }
}

class B {
    fun fB1() {
        println("fB1")
    }

    fun fAB() {
        println("fAB of B")
    }
}

fun main(args: Array<String>) {
//    var listStrings:MutableList<String> = mutableListOf("Zero", "One", "Two", "Three")
//    listStrings.swap(0, 3)  /*Doi cho phan tu 1 va 3 cho nhau*/
//    println("$listStrings")
//    println("pi = ${CompanionDemo.PI()}")
//    println("double pi = ${CompanionDemo.doublePi()}")
    var b = B()
    var a = A()
    a.callB2FromA(b)
}