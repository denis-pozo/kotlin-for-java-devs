package org.denispozo.oo

fun yetAnotherMain() {
    val emp = Employee2("John")
    println(emp.firstName)
    println(emp.fullTime)

    val emp2 = Employee2("Jane")
    println(emp2.firstName)
    println(emp2.fullTime)

    val emp3 = Employee2("Joe", false)
    println(emp3.firstName)
    println(emp3.fullTime)
}

// Kotlin constructor overloading
class Employee2(val firstName: String, fullTime: Boolean = true) {
    // with custom setters and getters
    var fullTime = fullTime
        get() {
            return field
        }

        set(value) {
            field = value
        }
}

// Java way of overloading the constructor
// class Employee2(val firstName: String) {
//
//     var fullTime: Boolean = true
//
//     constructor(firstName: String, fullTime: Boolean): this(firstName) {
//         this.fullTime = fullTime
//     }
//
// }
