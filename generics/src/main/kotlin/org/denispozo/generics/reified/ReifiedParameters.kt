package org.denispozo.generics.reified

import java.math.BigDecimal

fun main() {
    val mixedList: List<Any> = listOf("string", 1, BigDecimal(21.32), BigDecimal(322.3), "what!?")
    val bigDecimalsOnly = getElementsOfType<BigDecimal>(mixedList)
    val stringsOnly = getElementsOfType<String>(mixedList)
    println(bigDecimalsOnly)
    println(stringsOnly)
}

// Inline functions and reified T is required for T to be known by the compiler
// Only need reification if you want to use a generic parameter within a function
inline fun <reified T> getElementsOfType(list: List<Any>): List<T> {
    var newList: MutableList<T> = mutableListOf()
    for (element in list) {
        if (element is T) {
            newList.add(element)
        }
    }

    return newList
}
