package org.denispozo.oo.interfaces

// Interfaces are "open" by default
interface MyInterface {

    val number: Int
    val number2: Int
        get() = 50
    // Properties in interfaces don't have a backing field
    // get() = field can't be used

    fun myFunction(str: String)
}

interface MySubInterface: MyInterface {
    fun mySubFunction(num: Int)
}

class Something: MySubInterface {

    override val number = 25

    override fun mySubFunction(num: Int) {
        println("The integer: $num")
    }

    override fun myFunction(str: String) {
        println("The string: $str")
    }
}
