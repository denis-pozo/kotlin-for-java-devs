package org.denispozo.oo.challenge

class KtRoadBike (cadence: Int, gear: Int = 10, speed: Int, val tireWidth: Int) : KtBicycle(cadence, gear, speed) {

    override fun printDescription() {
        super.printDescription()
        println("The road bike has a tire width of $tireWidth mm.")
    }
}
