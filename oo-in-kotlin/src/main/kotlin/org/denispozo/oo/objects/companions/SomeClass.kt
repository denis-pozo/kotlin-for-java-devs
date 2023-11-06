package org.denispozo.oo.objects.companions

class SomeClass private constructor(val someString: String) {
    // You can't access this guys without instantiating the class
//    private val privateVar = 6
//
//    fun accessPrivateVar() {
//        println("I'm accessing privateVar: $privateVar")
//    }

    companion object {
        private var privateVar = 6

        fun accessPrivateVar() {
            println("I'm accessing privateVar: $privateVar")
        }

        fun justAssign(str: String) = SomeClass(str)
        fun upperOrLowerCase(str: String, lowercase: Boolean): SomeClass {
            if (lowercase) {
                return SomeClass(str.lowercase())
            } else {
                return SomeClass(str.uppercase())
            }
        }
    }
}

fun main() {
    SomeClass.accessPrivateVar()
    val someClass1 = SomeClass.justAssign("This is the string as is")
    val someClass2 = SomeClass.upperOrLowerCase("This isn't the string as is", false)
    println(someClass1)
    println(someClass2)
}
