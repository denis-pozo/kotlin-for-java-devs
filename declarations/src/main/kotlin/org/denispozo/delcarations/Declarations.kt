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

    // 11. Kotlin handles equals differently. == and equals are the same and check for structural equality
    val employeeOne = Employee("Mary", 1)
    val employeeTwo = Employee("John", 2)
    val employeeThree = Employee("John", 2)

    println("STRUCTURALLY EQUALS")
    println(employeeOne == employeeTwo)
    println(employeeTwo == employeeThree) // This one would be false in java
    println(employeeOne.equals(employeeTwo))
    println(employeeTwo.equals(employeeThree))

    // For referential equality there is the triple equal operator: ===
    println("REFERENTIALLY EQUAL")
    println(employeeOne === employeeTwo)
    println(employeeTwo === employeeThree) // This one would be false in java
    val employeeFour = employeeTwo
    println(employeeTwo === employeeFour) // This one would be false in java

    // Same for not equals
    println("NOT EQUAL")
    println(employeeOne != employeeTwo)
    println(employeeTwo !== employeeFour)
    println(employeeTwo !== employeeThree)

    // 12. Bit operators | -> or, & -> and
    val x = 0x00110101
    val y = 0x10011000

    println ("X or Y: " + (x or y))
    println ("X and Y: " + (x and y))

    // 13. Casting: instance of -> is and no need for casting
    val something: Any = employeeFour
    if (something is Employee) {
        // val newEmployee = something as Employee - It's not needed
        println("Employee four is actually an employee called ${employeeFour.name}")
    }

    // 14. String templates
    println(employeeOne)

    val change = 4.22
    println("Your change in \$ is $$change")

    val numerator = 10.99
    val denominator = 20.00
    println("The value of $numerator divided by $denominator is ${numerator/denominator}")

    // 15. Raw strings or triple quoted strings
    val filePath = """c:\somedir\somedir2"""
    println(filePath)

    val nurseryRhyme = """Humpty Dympty sat on the wall
                                *Humpty Dumpty had a great fall
                                *All the king's horses and all the king's men
                                *couldn't put Humpy together again.""".trimMargin("*")
    println(nurseryRhyme)

    // 16. Read, Eval, and Print Loop -> REPL
    // Tools -> Kotlin -> Kotlin REPL

}

class Employee(var name: String, val id: Int) {

    override fun toString(): String {
        return "Employee(name=$name, id=$id)" // String templates
    }

    override fun equals(obj: Any?): Boolean {
        if (obj is Employee) {
            return name == obj.name && id == obj.id
        }

        return false
    }
}
