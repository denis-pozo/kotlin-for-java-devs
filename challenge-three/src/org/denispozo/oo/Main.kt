package org.denispozo.oo

import org.denispozo.oo.challenge.KtBicycle
import org.denispozo.oo.challenge.KtMountainBike
import org.denispozo.oo.challenge.KtRoadBike

fun main() {

    val bike0 = KtBicycle(cadence = 61, speed = 38)
    val bike1 = KtMountainBike(33, 60, 15)
    val bike2 = KtRoadBike(45, 6, 12, 28)

    val bike3 = KtMountainBike("red", 6, 12, 28)

    println()
    bike0.printDescription()
    println()
    bike1.printDescription()
    println()
    bike2.printDescription()
    println()
    bike3.printDescription()
    println()

    println(KtMountainBike.availableColors.toString())
}
