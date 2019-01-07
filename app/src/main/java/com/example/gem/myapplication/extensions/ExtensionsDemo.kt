package com.example.gem.myapplication.extensions


fun MutableList<String>.swap(index1: Int, index2: Int) {
    var temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}
