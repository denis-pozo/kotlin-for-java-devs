package org.denispozo.whens

import java.math.BigDecimal

fun main() {
    val timeOfYear = Season.WINTER

    val num = 600

    when(num) {
        100, 600 -> println("600")
        200 -> println("200")
        300 -> println("300")
        else -> println("Doesn't match anything")
    }

    val obj: Any = "I'm a string"
    val obj2: Any = BigDecimal(25.2)
    val obj3: Any = 45

    val something: Any = obj3

    if (something is String) {
        println(something.uppercase())
    }
    else if (something is BigDecimal) {
        println(something.remainder(BigDecimal(10.5)))
    }
    else if (something is Int) {
        println("${something - 22}")
    }

    // OR
    when (something) {
        is String -> println(something.uppercase())
        is BigDecimal -> println(something.remainder(BigDecimal(10.5)))
        is Int -> println("${something-22}")
    }

    val z = when (something) {
        is String -> {
            println(something.uppercase())
            1
        }
        is BigDecimal -> {
            println(something.remainder(BigDecimal(10.5)))
            2
        }
        is Int -> {
            println("${something-22}")
            3
        }
        else -> {
            println("Oh shittttt")
            -1
        }
    }
    println(z)

    val str = when(timeOfYear) {
        Season.SPRING -> "Flowers are blooming"
        Season.SUMMER -> "It's hot"
        Season.FALL -> "It's getting cooler"
        Season.WINTER -> "I'm freezing"
    }
    println(str)

    val num2 = 3928
    when {
        num < num2 -> println("num is less than num2")
        num > num2 -> println("num is greater than num2")
        else -> println("num = num2")
    }
}

enum class Season {
    SPRING, SUMMER, FALL, WINTER
}
