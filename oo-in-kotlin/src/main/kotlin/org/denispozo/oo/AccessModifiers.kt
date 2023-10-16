package org.denispozo.oo

/** Top-Level Items - Access Modifiers
 *  Access Modifier | Kotlin                       | Java
 *  --------------------------------------------------------------------
 *  private         | Visible within the same file | Can't be used
 *  protected       | Can't be used                | Can't be used
 *  public          | Visible everywhere           | Visible everywhere
 *  internal        | Visible within same module   | N/A
 *  --------------------------------------------------------------------
 */

// 1. public is the default in kotlin
fun anotherMain() {
    // 2. class and files name don't need to match
    // 3. can have private classes
    val emp = Employee("John")
    println(emp.firstName)
}

// Kotlin style changing visibility
// class Employee protected constructor(val firstName: String){ }

// Kotlin style II
class Employee(val firstName: String){ }

// Kotlin style I
// class Employee constructor(val firstName: String){ }

// Java style
// class Employee constructor(firstName: String){
//     val firstName: String
//
//     init {
//         this.firstName = firstName
//     }
// }

