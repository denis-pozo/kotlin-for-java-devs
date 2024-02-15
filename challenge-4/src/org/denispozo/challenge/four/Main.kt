package org.denispozo.challenge.four

fun main() {

    // 5, 10, 15, 20, 25...5000
    val range = 5..5000
    for(i in range.step(5)) {
        print("$i ")
    }

    // Improved approach
    for(i in 5..5000 step 5) {
        print("$i ")
    }
    println()

    // -500 to 0
    for (i in -500..0) {
        print("$i ")
    }
    println()

    // Fibonacci sequence
    var prev = 1
    var prevprev = 0
    var current: Int
    print("0 ")
    print("1 ")
    for (i in 1..13 ) {
        current = prevprev + prev
        print("$current ")
        prevprev = prev
        prev = current
    }
    println()

    // 1, 11, 100, 99, 98, 2
    iloop@ for (i in 1..5) {
        println(i)
        if (i == 2) {
            break
        }
        for (j in 11..20) {
            println(j)
            for (k in 100 downTo 90) {
                println(k)
                if (k == 98) {
                    continue@iloop
                }
            }
        }
    }

    // Declare a variable called num (int)
    // Declare a variable called dnum and assign it as follows:
    // if num > 100, assign dnum -234.567
    // if num < 100, assign dnum 4444.555
    // if num == 100, assign dnum 0.0
    val num = 101
    val dnum = when {
        num < 100 -> -234.657
        num > 100 -> 4444.555
        else -> 0.0
    }
    println(dnum)


}
