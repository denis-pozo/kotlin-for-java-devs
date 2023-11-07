package org.denispozo.collections.stuff

fun main() {
    val setInts = setOf(10, 15, 19, 5, 3, -22)
    println(setInts.filter { it % 2 != 0 })

    val immutableMap = mapOf(
        1 to Car("Green", "Toyota", 2015),
        2 to Car("Red", "Ford", 2016),
        3 to Car("Silver", "Honda", 2013),
        17 to Car("Red", "BMW", 2015),
        8 to Car("Green", "Ford", 2010)
    )
    println(immutableMap.toSortedMap())
    println(immutableMap.filter { it.value.year == 2016 })
    println(immutableMap.filter { it.value.model == "Ford" }.map { it.value.color })
    println(immutableMap.all { it.value.year > 2014 })
    println(immutableMap.any { it.value.year > 2014 })

    val cars = immutableMap.values
    println(cars.find { it.year > 2014 })
    println(cars.groupBy { it.color })
    println(cars.sortedBy { it.year })

    val mutableMap = mutableMapOf(
        1 to Car("Green", "Toyota", 2015),
        2 to Car("Red", "Ford", 2016),
        3 to Car("Silver", "Honda", 2013)
    )
    mutableMap.filter { it.value.color == "Silver" }
    println("The filters map is $mutableMap") // filter returns a new map so it didn't change anything in the original map

    val ints = arrayOf(1, 2, 3, 4, 5)
    val add10List: MutableList<Int> = mutableListOf()
    for (i in ints) {
        add10List.add(i + 10)
    }
    println(add10List)
    // OR
    val add10ListAlt = ints.map { it + 10 }
    println(add10ListAlt.javaClass)
    println(add10ListAlt)

    println(immutableMap.map { it.value.year })
}

data class Car(val color: String, val model: String, val year: Int) { }
