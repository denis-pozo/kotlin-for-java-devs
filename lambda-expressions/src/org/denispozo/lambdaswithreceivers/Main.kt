package org.denispozo.lambdaswithreceivers

import java.lang.StringBuilder

fun main() {
    val employees = listOf(
        Employee("John", "Smith", 2012),
        Employee("Jane", "Wilson", 2015),
        Employee("Mary", "Johnson", 2010),
        Employee("Mike", "Jones", 2002)
    )

    findByLastName(employees, "Wilson")
    findByLastName(employees, "Smithson")

    println(countTo100())
    println(countTo100With())
    println(countTo100Apply())

    "Some String".apply someString@ {
        "Another String".apply {
            println(this@someString.uppercase())
            println(this.lowercase())
        }
    }

}

fun findByLastName(employees: List<Employee>, lastName: String) {
    employees.forEach {
        if (it.lastName == lastName) {
            println("Yes, there's an employee with the last name $lastName")
            return
        }
    }

    println("Nope, there is no employee with the last name $lastName")
}

fun countTo100(): String {
    val numbers = StringBuilder()
    for (i in 1..99) {
        numbers.append("$i, ")
    }
    numbers.append(100)
    return numbers.toString()
}

// Using with and lambdas
// with is converting the instance passed in into a receiver
fun countTo100With() =
    with(StringBuilder()) {
        for (i in 1..99) {
            append("$i, ")
        }
        append(100)
        toString()
    }

// Using apply and lambdas
// similar to with but it returns the instance passed in
fun countTo100Apply() =
    StringBuilder().apply {
        for (i in 1..99) {
            append("$i, ")
        }
        append(100)
    }.toString()

data class Employee(val firstName: String, val lastName: String, val startYear: Int)
