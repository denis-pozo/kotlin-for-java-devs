package org.denispozo.generics.covariance

fun main() {
    val shortList: List<Short> = listOf(1, 2, 3, 4, 5)
    convertToInt(shortList)
}

// Immutable collections are covariant but mutable collections are not
fun convertToInt(collection: List<Number>) {
    for (num in collection) {
        println("${num.toInt()}")
    }
}

fun waterGarden(garden: Garden<Flower>){}

fun tendGarden(roseGarden: Garden<Rose>){
    waterGarden(roseGarden)
}

open class Flower {}

class Rose: Flower() {}

// We need to make Garden covariant in order to have methods for flowers applicable to all types of flowers
class Garden<out T: Flower> {

    val flowers: List<T> = listOf()
    // By using out in the class signature for T, we can use it as a return type
    fun pickFlower(i: Int): T = flowers[i]
    // But we CAN'T use it as an input param
    // fun plantFlower(flower: T) { }
}
