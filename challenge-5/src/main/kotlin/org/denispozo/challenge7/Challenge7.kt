package org.denispozo.challenge7

fun main() {
    val joe = Person("Joe", "Jones", 45)
    val jane = Person("Jane", "Smith", 12)
    val mary = Person("Mary", "Wilson", 70)
    val john = Person("John", "Adams", 32)
    val jean = Person("Jean", "Smithson", 66)

    val peopleByLastName = mutableMapOf<String, Person>()
    peopleByLastName.put(joe.lastName, joe)
    peopleByLastName.put(jane.lastName, jane)
    peopleByLastName.put(mary.lastName, mary)
    peopleByLastName.put(john.lastName, john)
    peopleByLastName.put(jean.lastName, jean)

    val people = mapOf(
        joe.lastName to joe,
        jane.lastName to jane,
        mary.lastName to mary,
        john.lastName to john,
        jean.lastName to jean
    )

    println(people.filter { it.value.lastName.startsWith("s", true) }.count())
    val pairs = people.map { Pair(it.value.firstName, it.value.lastName) }
    println(pairs)

    val firstNames = people.map { it.value.firstName }
    val lastNames = people.map { it.value.lastName }
    val pairs2 = firstNames.zip(lastNames)
    println(pairs2)

    people.also {
        it.map { println("${it.value.firstName} is ${it.value.age} years old")}
    }

    val (fName, lName, age) = joe
    println("fName = $fName, lName = $lName, age = $age")

    val list1 = listOf(1, 4, 9, 15, 33)
    val list2 = listOf(4, 55, -83, 15, 22, 101)
    val result = list1.filter { list2.contains(it) }
    println(result)

    val regularPaper = Box<Regular>()
    var paper = Box<Paper>()
    paper = regularPaper

}

// data class Person (val firstName: String, val lastName: String, val age: Int) { }
// or implementing component functions
class Person (val firstName: String, val lastName: String, val age: Int) {
    operator fun component1() = firstName
    operator fun component2() = lastName
    operator fun component3() = age
}

class Box<out T> {}

open class Paper {}

class Regular: Paper() {}
class Premium: Paper() {}
