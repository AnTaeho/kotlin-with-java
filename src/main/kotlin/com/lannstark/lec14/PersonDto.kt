package com.lannstark.lec14

fun main() {
    val dto1 = PersonDto("an", 100)
    val dto2 = PersonDto("an", 100)
    println(dto1 == dto2)
    println(dto1)
}

data class PersonDto(
    private val name: String,
    private val age: Int
)