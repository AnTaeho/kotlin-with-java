package com.lannstark.lec09

fun main() {
    val person = Person("ANTaeHo", 100)
    println(person.name)
    person.age = 10
    println(person.age)

    val person2 = Person("AAA")
}

class Person(
    name: String = "안태호",
    var age: Int = 1
) {

    var name = name
        set(value) {
            field = value.uppercase()
        }

    val uppercaseName: String
        get() = this.name.uppercase()

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

    //하지만 디폴트 파라미터를 권장
    constructor(name: String): this(name, 1)

//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }

    val isAdult: Boolean
        get() = this.age >= 20
}