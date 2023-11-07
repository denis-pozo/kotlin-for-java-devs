package org.denispozo.lambdas

fun main() {
    val employees = listOf(
        Employee("John", "Smith", 2012),
        Employee("Jane", "Wilson", 2015),
        Employee("Mary", "Johnson", 2010),
        Employee("Mike", "Jones", 2002)
        )

    println(employees.minBy { e -> e.startYear})
    // Using member reference
    println(employees.minBy(Employee::startYear))
    // Using member reference for top level functions
    run(::topLevel)

    var num = 10
    run {
        num += 15
        println(num)
    }
}

fun topLevel() = println("I'm in a function")

data class Employee(val firstName: String, val lastName: String, val startYear: Int)
