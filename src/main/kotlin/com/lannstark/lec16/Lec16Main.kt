package com.lannstark.lec16

fun main() {
    val str = "AAAAAB"
    println(str.lastChar())

    println(3 add2 4)
}

fun String.lastChar(): Char {
    return this[this.length - 1]
}

infix fun Int.add2(other: Int): Int {
    return this + other
}

fun createPerson(firstName: String, lastName: String): Person {
    fun validateName(name: String, fieldName: String) {
        if (name.isEmpty()) {
            throw IllegalArgumentException()
        }
    }

    validateName(firstName, "firstName")
    validateName(lastName, "lastName")
    return Person(firstName, lastName, 1)
}

