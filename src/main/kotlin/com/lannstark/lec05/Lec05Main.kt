package com.lannstark.lec05

fun main() {

}

fun validateIsNotNegative(score: Int) {
    if (score !in 0..100) {
        throw IllegalArgumentException("0부터 100 사이만 가능합니다.")
    }
}

fun getPassOrFail(score: Int): String {
    return if (score >= 50) "P" else "F"
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}

fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun startWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("어디서 많이 본 숫자 입니다.")
        else -> println("1, 0 ,-1이 아닙니다")
    }
}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("number is 0")
        number % 2 == 0 -> println("number is Even")
        else -> println("number is Odd")
    }
}
