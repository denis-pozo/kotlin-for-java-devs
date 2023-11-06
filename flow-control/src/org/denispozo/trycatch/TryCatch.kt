package org.denispozo.trycatch

import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun main() {
    println(getNumber("22"))
    println(getNumber("22.5"))
//    println(getNumber("22.5") ?: throw IllegalArgumentException("Number isn't an Int"))
    println(getNumber("22.5") ?: "Number isn't an Int")
    notImplementedYet("string")
}

fun getNumber(str: String): Int? {
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        null
    } finally {
        println("There was an exception when parsing the number $str")
    }
}

fun notImplementedYet(something: String) : Nothing {
    throw IllegalArgumentException("Implement me!")
}
