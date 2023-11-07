package org.denispozo.maps

fun main() {

    val immutableMap = mapOf<Int, Car>(
        1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("silver", "Honda", 2013),
    )
    println(immutableMap.javaClass)
    println(immutableMap)

    val mutableMap = hashMapOf(
        "John's car" to Car("red", "Range Rover", 2010),
        "Jane's car" to Car("blue", "Hyundai", 2012)
    )
    mutableMap.put("Mary's Car", Car("red", "Corevette", 1965))
    println(mutableMap.javaClass)
    println(mutableMap)

    val pair = Pair(10, "ten")
    // destructuring declaration
    val (firstValue, secondValue) = pair
    println("$firstValue, and $secondValue")

    for (entry in mutableMap) {
        println(entry.key)
        println(entry.value)
    }

    for ((k, v) in mutableMap) {
        println(k)
        println(v)
    }

    val car = Car("blue", "Corvette", 2000)
    val (color, model, year) = car
    println("color = $color, model = $model, year = $year")

}

//class Car(val color: String, val model: String, val year: Int) {
//    // To make a class deconstructurable:
//    operator fun component1() = color
//    operator fun component2() = model
//    operator fun component3() = year
//}

// data class come with deconstructurable properties out-of-the-box
data class Car(val color: String, val model: String, val year: Int) { }
