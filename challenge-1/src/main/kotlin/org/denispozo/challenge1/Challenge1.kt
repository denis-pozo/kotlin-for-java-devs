package org.denispozo.challenge1

fun main() {

    val hello1 = "Hello"
    val hello2 = "Hello"

    println("hello1 is referentially equal to hello2: ${hello1 === hello2}")
    println("hello1 is structurally equal to hello2: ${hello1 == hello2}")

    var num = 2988

    val root: Any = "The Any type is the root of the kotlin class hierarchy"
    if (root is String) println(root.uppercase())

    println("    1\n   11\n  111\n 1111")
    println("""    1
        |   11
        |  111
        | 1111""".trimMargin())
}
