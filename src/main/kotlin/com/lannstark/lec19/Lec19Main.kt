package com.lannstark.lec19

import com.lannstark.lec18.Fruit

typealias FruitFilter = (Fruit) -> Boolean

fun filterFruits(fruit: List<Fruit>, filter: FruitFilter) {

}

typealias USGMap = Map<String, UltraSuperGuardianTribe>

data class UltraSuperGuardianTribe(
    val name: String
)

fun main() {
    val numbers = listOf(1,2,3)

    numbers.map { number -> number + 1 }
        .forEach{ number -> println(number) }

    for (number in numbers) {
        if (number == 2) {
            break
        }
    }

    abc@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 2) {
                break@abc
            }
            println("aa")
        }
    }
}


