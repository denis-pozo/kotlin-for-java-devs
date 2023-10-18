package org.denispozo.oo.functions

import org.denispozo.oo.DataClassCar

fun main() {
    println(labelMultiply(3, 4, "The result is: "))
    println(labelMultiplyExp(3, 4, "The result is: "))

    val emp = Employee("Jane")
    println(emp.upperCaseFirstName())

    // Mixing input parameters -> In kotlin this is called NAMED ARGUMENTS
    println(labelMultiply(label = "Here's the result", operand1 = 3, operand2 = 9))

    val car1 = DataClassCar("blue", "Toyota", 2014)
    val car2 = DataClassCar("red", "Ford", 2016)
    val car3 = DataClassCar("grey", "Volkswagen", 2019)

    printColors(car1, car2, car3)

    val manyCars = arrayOf(car1, car2, car3)
    // Spread operator * unpacks the array elements and pass them in
    printColors(*manyCars)

    val moreCars = arrayOf(car2, car3)
    val car4 = car2.copy()
    val lotsOfCars = arrayOf(*manyCars, *moreCars, car4)
    for (c in lotsOfCars) {
        println(c)
    }

    val s = "this is all in lowercase"
    println(Utils().upperFirstAndLast(s))
    // Alternative with extension functions
    println(s.upperFirstAndLast())
}

// Functions with block body {}
fun labelMultiply(operand1: Int, operand2: Int, label: String): String {
    return ("$label ${operand1 * operand2}")
}

// Functions with expression body !{}
fun labelMultiplyExp(operand1: Int, operand2: Int, label: String): String =
    "$label ${operand1 * operand2}"

// Functions with expression body !{} and inline
inline fun labelMultiplyInline(operand1: Int, operand2: Int, label: String): String =
    "$label ${operand1 * operand2}"

class Employee(val firstName: String) {
    fun upperCaseFirstName() = firstName.uppercase()
}

fun printColors(vararg cars: DataClassCar) {
    for(car in cars) {
        println(car.color)
    }
}

// Extending functions
fun String.upperFirstAndLast(): String {
    val upperFirst = this.substring(0, 1).uppercase() + this.substring(1)
    return upperFirst.substring(0, upperFirst.length - 1) + upperFirst.substring(upperFirst.length - 1, upperFirst.length).uppercase()
}
