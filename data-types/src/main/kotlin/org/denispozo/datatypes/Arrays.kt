package org.denispozo.datatypes

import org.denispozo.javacode.DummyClass
import java.math.BigDecimal

fun yetAnotherMain() {
    val names = arrayOf("John", "Jane", "Jill", "Joe")

    val longs1 = arrayOf(1L, 2L, 3L)
    val longs2 = arrayOf<Long>(1, 2, 3)

    val longs3 = arrayOf(1, 2, 3, 4)

    println(names is Array<String>)
    println(longs1 is Array<Long>)
    println(longs2 is Array<Long>)
    println(longs3 is Array<Int>)

    println(longs1[2])

    val evenNumbers = Array(16) { i -> i * 2 }
    for (number in evenNumbers) {
        print("$number ")
    }

    println()
    val lotsOfNumbers = Array(100) { i -> i + 1 }
    for (number in lotsOfNumbers) {
        print("$number ")
    }

    println()
    val zeroes = Array(10) { 0 }
    for (number in zeroes) {
        print("$number ")
    }

    println()
    var someArray: Array<Int>
    someArray = arrayOf(1, 2, 3, 4)
    for (number in someArray) {
        print("$number ")
    }

    someArray = Array(6) { i -> (i + 1) * 10 }
    println()
    for (number in someArray) {
        print("$number ")
    }

    val mixedArray = arrayOf("hello", 22, BigDecimal(10.0), 'a')
    println()
    for (number in mixedArray) {
        print("$number ")
    }
    println(" -> Is mixed array an array of any? ${mixedArray is Any}")
    val myIntArray = arrayOf(3, 8, 938, 12, 33, 8).toIntArray() // In case of arrays being called from a java method
    DummyClass().printNumbers(myIntArray)

    println()
    // var someOtherArray = Array<Int>(5) -> It does not work
    var someOtherArray = IntArray(5) // It works
    DummyClass().printNumbers(someOtherArray)

    val convertedIntArray = myIntArray.toTypedArray()
    println()
    for ( number in convertedIntArray ) {
        print("$number ")
    }
}
