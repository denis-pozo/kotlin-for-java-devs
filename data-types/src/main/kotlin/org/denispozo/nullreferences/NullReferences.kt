package org.denispozo.nullreferences

fun main() {
    // Nullable variables
    val str: String? = null
    println("What happens when we do this: ${str?.uppercase()}")

    if (str == null) {
        null
    } else {
        str.uppercase()
    }

    // Short-circuiting null checks!!
    // val countryCode: String? = bankBranch?.address?.country?.countryCode

    // The elvis operator ?: -> if str is null, then default!
    val str2 = str ?: "This is the default value"
    println(str2)

    // Casting with the "as?" operator doesn't work :( -> returns null
    val something: Any = arrayOf(1, 2, 3, 4)
    val str3 = something as? String
    println(str3)

    println(str3?.uppercase())

    // You can tell your code that a variable can't be null or explicitly throw a null pointer exception
    // !! not null assertion operator
    val notNull: String? = "This isn't null"
    val str4 = notNull!!.uppercase()
    println(str4)

    val isNUll: String? = null
    try {
        val str5 = str!!.uppercase() // -> throws an exception
    } catch (e: Exception) {
        println("We just capture a null pointer exception - yay! $e")
    }

    // How to call a function that expects a non nullable variable?
    val str6: String? = "This isn't null"
    // Option 1
    printText(str6!!)
    // Option 2
    str6?.let { printText(it) }
    // Same as
    if (str6 != null) {
        printText(str6)
    }

    val str7: String? = null
    val anotherStr = "This is not nullable"
    // Equals operator is a safe operator
    println(str7 == anotherStr)

    // Null safety and arrays
    val nullableInts = arrayOfNulls<Int>(5)
    for (number in nullableInts) {
        print("$number ")
    }

}

fun printText(text: String) {
    println(text)
}
