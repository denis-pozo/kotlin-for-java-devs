package org.denispozo.oo.inheritance

// Open can go away, you can't have a final abstract class!
// open abstract class Printer(val modelName: String) { }
abstract class Printer(val modelName: String) {

    open fun printModel() = println("The model name of this printer is $modelName")
    abstract fun bestSellingPrice(): Double
}

open class LaserPrinter(modelName: String, ppm: Int) : Printer(modelName) {

    final override fun printModel() = println("The model name of this laser printer is $modelName")
    override fun bestSellingPrice(): Double = 129.99
}

open class SpecialLaserPrinter(modelName: String, ppm: Int): LaserPrinter(modelName, ppm) {
    // we can't override a final function -> compilation error
    // override fun printModel() = println("The model name of this laser printer is $modelName")

}

// If primary constructor exists all subclasses are required to used it
open class Something {
    val someProperty: String

    constructor(someParameter: String) {
        someProperty = someParameter
        println("I'm in the parent's constructor")
    }
}

class SomethingElse: Something {
    constructor(someOtherParameter: String, z: Int): super(someOtherParameter) {
        println("I'm in the parent's constructor")
    }
}

// Inheritance with data classes, they can't extend other classes, they are final -> Compilation Error
// open data class DataClass(val number: Int)
