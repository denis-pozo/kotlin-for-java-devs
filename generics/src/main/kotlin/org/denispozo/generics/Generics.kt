package org.denispozo.generics

import java.math.BigDecimal


fun main() {

    val list = mutableListOf("Hello")
    list.add("another string")
//    printCollection(list)
    list.printCollection()

    val bdList = mutableListOf(BigDecimal(-33.45), BigDecimal(3503.99), BigDecimal(0.329))
//    printCollection(bdList)
    bdList.printCollection()
}

//fun <T> printCollection(collection: List<T>) {
//    for (item in collection) {
//        println(item)
//    }
//}
//
// Or via extension functions
fun <T> List<T>.printCollection() {
    for (item in this) {
        println(item)
    }
}
