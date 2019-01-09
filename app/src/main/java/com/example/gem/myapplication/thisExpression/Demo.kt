package com.example.gem.myapplication.thisExpression

class C {

}

class A {
    inner class B {
        fun C.extendingFunction1() {
            val thisAtA = this@A
            println()
            println("This at A = $thisAtA")

            val thisAtB = this@B
            println()
            println("This at B = $thisAtB")

            val thisAtExtendingFunction1 = this@extendingFunction1
            println()
            println("This at extending function 1 = $thisAtExtendingFunction1")

            val thisAtHere = this
            println()
            println("This at here = $thisAtHere")

            val noNameFunction = fun() {
                val thisAtNoName = this
                println()
                println("This no name = $thisAtNoName")
            }
            noNameFunction()

            val lambdaFunction = { s: String ->
                val thisAtLambda = this
                println()
                println("This at lambda = $thisAtLambda")
            }
            lambdaFunction("Duan")
        }

        fun methodOfClassB() {
            var c = C()
            c.extendingFunction1()
        }
    }
}

fun main(args: Array<String>) {
    var a = A()
    a.B().methodOfClassB()
}