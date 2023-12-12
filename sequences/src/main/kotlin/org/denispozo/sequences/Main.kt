package org.denispozo.sequences

fun main() {

    val immutableMap = mapOf<Int, Car>(
        1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("silver", "Honda", 2016),
        17 to Car("red", "BMW", 2015),
        8 to Car("green", "Ford", 2010)
    )

    println(
        // Returning a new collection after every trasnformation can make things exploit when N -> INF
        immutableMap
            .filter { it.value.model == "Ford" }
            .map { it.value.color }
    )

    // With sequences, the single elements are evaluated along the chain without returning a whole collection
    // Similar to java streams
    println(
        immutableMap.asSequence()
            .filter { it.value.model == "Ford" }
            .map { it.value.color }
    ) // This sequence lacks a terminal operation

    // If sequences lack terminate operations, they don't get evaluated
    listOf("Joe", "Mary", "Jane")
        .filter { println("filtering $it"); it[0] == 'J'}
        .map { println("mapping $it"); it.uppercase()}
        .toList() // This is a terminal operation

}

data class Car (val color: String, val model: String, val year: Int) { }
