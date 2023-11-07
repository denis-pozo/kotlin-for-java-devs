package org.denispozo.collections

fun main() {

    val strings = listOf("spring", "summer", "fall", "winter")
    println(strings.javaClass)
    // class java.util.Arrays$ArrayList, be careful is immutable for kotlin but not for java

    val emptyList = emptyList<String>()
    println(emptyList.javaClass)
    // class kotlin.collections.EmptyList

    if(!emptyList.isEmpty()) {
        println(emptyList[0])
    }

    // null items will be left out
    val notNullList = listOfNotNull("hello", null, "goodbye")
    println(notNullList)

    val arrayList = arrayListOf(1, 2, 4)
    println(arrayList.javaClass)

    val mutableList = mutableListOf(1, 2, 3)
    println(mutableList.javaClass)
    // mutable lists are accessible also with [] notation

    val array = arrayOf("black", "white", "green")
    val colorList = listOf(*array)
    val altColorList = array.toList()
    println(colorList)
    println(altColorList)

    val ints = intArrayOf(1, 2, 3)
    println(ints.toList())
}
