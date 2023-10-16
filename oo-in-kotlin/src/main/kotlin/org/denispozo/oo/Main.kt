package org.denispozo.oo

fun main() {

    val car = DataClassCar("blue", "Toyota", 2015)
    println(car)
    val car2 = DataClassCar("blue", "Toyota", 2015)
    println(car == car2)
    val car3 = car.copy()
    println(car3)
    val car4 = car.copy(year = 2016)
    println(car4)

    val emp = Employee("John")
    println(emp)
    val emp2 = Employee("John")
    println(emp == emp2)
}
