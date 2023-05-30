package com.lannstark.lec08

fun main() {
    repeat("A")
    repeat("A", useNewLine = false)

    printNameAndGender(gender = "MALE", name = "안태호")

    printAll("A", "B", "C")

    val array = arrayOf("A", "B", "C")
    printAll(*array)
}

fun max(a: Int, b: Int) = if (a > b) a else b

fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            println(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println("name = ${name}")
    println("gender = ${gender}")
}

fun printAll(vararg strings: String) {
    for (string in strings) {
        println("string = ${string}")
    }
}