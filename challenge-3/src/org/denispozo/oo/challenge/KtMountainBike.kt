package org.denispozo.oo.challenge

class KtMountainBike (var seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10): KtBicycle(cadence, gear, speed) {

    constructor(color: String, seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10):
            this(seatHeight, cadence, speed, gear) {
        println("The mountain bike is $color.")
    }

    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a seat height of $seatHeight inches.")
    }

    companion object {
        val availableColors: List<String> = listOf("blue", "red", "white", "black", "green", "brown")
    }
}
