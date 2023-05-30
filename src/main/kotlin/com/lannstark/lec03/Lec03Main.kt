package com.lannstark.lec03

fun main() {

    val number1 = 3
    val number2: Long = number1.toLong()
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        val person = obj as Person
        println(person.age)
    }
}

fun printAgeIfPerson1(obj: Any?) {
    val person: Person? = obj as? Person
    println(person?.age)
    // if obj == null -> NPE
    // ? 연산자 활용
}

fun aa() {
    val str = "ABCD"
    val str1 = str[1]
    println(str1)
}