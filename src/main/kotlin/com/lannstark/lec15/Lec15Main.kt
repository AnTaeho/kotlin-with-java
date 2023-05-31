package com.lannstark.lec15

fun main() {

    var array = arrayOf(100, 200)

    for (i in array.indices) {
        println("i = ${i}")
    }

    array.plus(300)

    for ((idx, value) in array.withIndex()) {
        println("idx = ${idx}")
        println("value = ${value}")
    }

    for (i in array) {
        println("i = ${i}")
    }

    val numbers = listOf(100, 200)
    val list = emptyList<Int>()

    println(numbers[0])

    for (number in numbers) {
        println("number = ${number}")
    }

    val numbers1 = mutableListOf(100, 200)
    numbers1.add(2,300)

    val oldMap = mutableMapOf<Int, String>()
    oldMap.put(0, "fnaj")
    oldMap[2] = "nfajnfa"

    val stringMap = mapOf(1 to "aaa", 2 to "bbb")
}