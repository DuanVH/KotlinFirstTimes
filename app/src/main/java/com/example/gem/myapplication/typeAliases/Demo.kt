package com.example.gem.myapplication.typeAliases

typealias IntSet = Set<Int>
typealias StringMap<K> = MutableMap<K, String?>

class A {
    inner class X {
        init {
            println("X of A")
        }
    }
}

class B {
    inner class X {
        init {
            println("X of B")
        }
    }
}

typealias XOfA = A.X
typealias XOfB = B.X

fun main(args: Array<String>) {

    /* ko su dung bi danh*/
//    var stringMaps: MutableMap<String, String?> = mutableMapOf<String, String?>("Duan" to "10", "Ha Anh" to "20")

    /* su dung bi danh
    * cung chua co gi dac biet
    * */
    var stringMaps: StringMap<String> = mutableMapOf<String, String?>("Duan" to "10", "Ha Anh" to "20")
    println("${stringMaps.values}")

    /* Trong truong hop ko su dung bi danh */
    println()
    var xOfA = A().X()
    var xOfB = B().X()

    /* Truong hop su dung bi danh */
    println()
    A().XOfA()
    B().XOfB()

}