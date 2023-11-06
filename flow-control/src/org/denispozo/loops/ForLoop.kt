package org.denispozo.loops

fun main() {
    val range = 1..5
    val charRange = 'a'..'z'
    val stringRange = "ABC".."XYZ"

    println(3 in range)
    println('q' in charRange)
    println("CCC" in stringRange)
    println("CCCCCC" in stringRange)
    println("ZZZZZZ" in stringRange)
    println("ZZZZZZ" !in stringRange)

    val backwardRange = 5.downTo(1)
    val stepRange = 3..15
    val stepThree = stepRange.step(3)
    val reversedRange = range.reversed()

    // 1. Looping over ranges
    for ( i in range) {
        print("$i ")
    }

    println()
    for ( i in stepRange) {
        print("$i ")
    }

    println()
    for ( i in reversedRange) {
        print("$i ")
    }

    println()
    val str = "Hello"
    for ( i in str) {
        print("$i ")
    }

    println()
    for ( num in 1..20 step 4) {
        print("$num ")
    }

    println()
    for ( num in 20 downTo 10 step 2) {
        print("$num ")
    }

    println()
    // Not including the closing number
    for ( num in 20 until 28 step 2) {
        print("$num ")
    }

    // 2. Looping over arrays
    val seasons = arrayOf("spring", "summer", "winter", "fall")
    println()
    for (season in seasons) {
        print("$season ")
    }

    println()
    for (index in seasons.indices) {
        println("${seasons[index]} is season number $index")
    }

    seasons.forEach { println(it) }
    seasons.forEachIndexed { index, value -> println("$value is season number $index") }

    // Breaking out of the loop to an outer loop -> it shouldn't be used unless super necessary (it can get messy)
    for (i in 1..3) {
        println("i = $i")
        jloop@ for (j in 1 .. 4) {
            print("j = $j, ")
            for (k in 1 .. 10) {
                print("k = $k, ")
                if (k == 7) {
                    break@jloop;
                }
            }
            println()
        }
    }
}
