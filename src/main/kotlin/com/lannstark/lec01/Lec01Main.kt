package com.lannstark.lec01

fun main() {

    // 타입을 추론하지만, 원한다면 써도 된다.
    var number1 = 10L  // 값을 바꿀 수 있다.
    val number2 = 10L  // 값을 바꿀 수 없다.

    var number3: Long? = 1_000L
    number3 = null

    var person = Person("안태호")
}