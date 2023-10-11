package org.denispozo.challenge2

import org.denispozo.challenge2.javacode.Javacode

fun main() {

    // 1. Declare a non-nullable float variable two ways,
    // and assign it the value -3847.384
    val floaty1: Float = -3847.384f
    val floaty2 = (-3847.384).toFloat()

    // 2. Now change both of those variable declarations into nullable variables.
    val floaty1Nullable: Float? = floaty1
    val floaty2Nullable: Float? = floaty2

    // 3. Now declare an array of type non-nullable Short. Make it size 5,
    // and assign it the values 1, 2, 3, 4, and 5.
    val shorties: Array<Short> = Array(5){ i -> (i + 1).toShort() }
    for (number in shorties) {
        print("$number ")
    }
    println()

    // 4. Now declare an array of nullable Ints and initialize it with the values
    // 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, etc., all the way up to 200.
    val nullableInts: Array<Int?> = Array(40) { i -> (i * 5) + 5}
    for (number in nullableInts) {
        print("$number ")
    }
    println()

    // 5. You have to call a Java method with the following signature from Kotlin:
    // public void method1(char[] charArray). Declare an array that you could
    // pass to the method and initialize it with the values 'a', 'b', and 'c'.
    val chars = charArrayOf('a', 'b', 'c')
    Javacode().method1(chars)


    // 6. Given the following code:
    val x: String? = "I AM IN UPPERCASE"
    // Using one line of code, declare another string variable,
    // and assign it x.toLowerCase() when x isn't null,
    // and the string "I give up!" when x is null.
    val y = x?.lowercase() ?: "I give up!"
    println(y)

    // 7. Now use the let function to (a) lowercase the string, and then
    // (b) replace "am" with "am not" in the result
    val wtf = x?.let { it.replace("AM", "AM NOT").lowercase() }
    println(wtf)

    // 8. You're really, really confident that the variable myNonNullVariable can't
    // contain null.
    // Change the following code to assert that myNonNullVariable isn't null
    // (and shoot yourself in the foot!)
    val myNonNullVariable = "Clearly not null"
    myNonNullVariable!!


}
