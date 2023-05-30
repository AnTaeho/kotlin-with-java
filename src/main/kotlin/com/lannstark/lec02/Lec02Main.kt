package com.lannstark.lec02


fun main() {
    //safe Call
    val str: String? = "ABC"
    //str.length -> 불가능
    println(str?.length) // 3

    val str2: String? = null
    println(str2?.length ?: 0) // 0
}

fun startWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException()
}

fun startWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startWith(str: String?): Boolean {
    // !! -> 절대 null 일 수 없는 상황에
    return str!!.startsWith("A")
}