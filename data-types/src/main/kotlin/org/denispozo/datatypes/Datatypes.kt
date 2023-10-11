package org.denispozo.datatypes

import org.denispozo.javacode.DummyClass

// Primitive Types
fun anotherMain() {
    val myInt = 10
    println("Is Integer the default datatype? ${myInt is Int}")
    val myLong = 22L

    // Kotlin does not automatically widen numbers
    // var myLong2: Long = myInt (doesn't work)
    // But:
    val myLong2 = myInt.toLong()
    val myByte: Byte = 111
    val myShort: Short = myByte.toShort()

    // Decimals
    val myDouble = 65.984
    println("Is Double the default decimal datatype? ${myDouble is Double}")

    val myFloat = 838.8492f
    println("This is a float: ${myFloat is Float}")
    println("${myFloat.toDouble()} is a double: ${myFloat.toDouble() is Double}")

    // Characters
    val char = 'b'
    // You can't assign a number to a char as in java for ascii code
    // val myChar: Char = 65
    val myCharInt = 65
    println(myCharInt.toChar())

    // Boolean
    val myBoolean = true
    val vacationTime = false
    val onVacation = DummyClass().isVacationTyme(vacationTime)
    println(onVacation)

    val anything: Any = "Whatever"
    println("is $anything the same as anything? ${anything == "anything"}")
}
