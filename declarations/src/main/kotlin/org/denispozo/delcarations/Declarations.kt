package org.denispozo.delcarations

typealias Employees = Set<Employee>

fun main(args: Array<String>) {
    var number = 10
    number = 11

    val employees: Employees = mutableSetOf()

    val shortNumber: Short = 25

    val employee = Employee("Denis Pozo", 500)
    employee.name = "Denís Pozo"

    val employee2: Employee
    val number2 = 100

    employee2 = if (number < number2) {
        Employee("Jane Smith", 400)
    } else {
        Employee("Mike Watson", 150)
    }

    // Some slight differences between Java and Kotlin
    // 1. No need semi-colons
    var variableJava = "foo";
    var variableKotlin = "foo"

    // 2. Wrappers for most commonly used java standard methods/libs
    println("Hello, World!")

    // 3. Soft keywords - language keywords that can be used as long as they are not used where they can be used. (not recommended)
    val suspended = "suspended"

    // 4. Square brackets to access elements of collections
    val names = arrayListOf("John", "Jane", "Mary")
    println(names[1])

    // 5. Own String class, hides some methods existing in the java class. For example: length is a property
    println(variableKotlin.length)

    // 6. Exceptions - No need to declare exception can be thrown, throws doesn't exist (All exceptions are unchecked)

    // 7. Ternary operator doesn't exist, if is the way
    // q = x ? y : z

    // 8. For loop doesn't exist as it is in java
    // for (i = 0, i < 20; i++) :S

    // 9. static keyword doesn't exist, concept does
    // private static final String WHATEVER;

    // 10. new keyword doesn't exist!!

}

data class Employee(var name: String, val id: Int)
