package com.example.gem.myapplication.delegation

interface BirdInterface {
    fun fly()
}

class Eagle(var age: Int) : BirdInterface {
    override fun fly() {
        println("Eagle fly ... $age")
    }
}

class Cuckoo(b: BirdInterface) : BirdInterface by b {
//    override fun fly() {
//        println("Cuckoo fly ... ")
//    }
}

fun main(args: Array<String>) {
    var e = Eagle(3)
    e.fly()  /* -> Eagle fly ... */
    var c = Cuckoo(e)
    c.fly()
    /* -> Cuckoo fly ...
       -> Eagle fly ...
    Khi override method thi chac chan se thuc hien method duoc override
    Neu bo override thi nguoc lai
    Tuong tu nhu khi ke thua*/
}