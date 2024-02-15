package org.denispozo.oo.challenge

open class KtBicycle(var cadence: Int, var gear: Int = 10, var speed: Int) {

    fun applyBrake(decrement: Int) {
        this.speed -= decrement
    }

    fun speedUp(increment: Int) {
        this.speed += increment
    }

    open fun printDescription() = println("Bike is in gear $gear with a cadence of $cadence travelling at a speed of $speed.")
}
