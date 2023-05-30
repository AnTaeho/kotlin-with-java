package com.lannstark.lec04

import com.lannstark.lec04.JavaMoney

fun main() {

    val money1 = JavaMoney(2000L)
    val money2 = JavaMoney(1000L)

    if (money1 > money2) {
        println("Money1 이 Money2보다 돈이 많다.")
    }
    val money3  = JavaMoney(1000L)
    val money4 = money3
    val money5 = JavaMoney(1000L)

    println(money3 == money4)
    print(money3 == money5)

    print(money3.equals(money4))
    print(money3.equals(money5))

    val money = Money(1_000L)
    val money6 = Money(2_000L)

    println(money + money6)
}