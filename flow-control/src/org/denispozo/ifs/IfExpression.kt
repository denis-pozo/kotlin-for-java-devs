package org.denispozo.ifs

fun main() {
    var num: Int
    var someCondition = 69 < 22

    if (someCondition) {
        num = 50
    } else {
        num = 592
    }

    // Ternary operator doesnt exist in kotlin
    // num = someCondition ? 50 : 592

    val num2 = if (someCondition) 50 else 592

    val num3 = if (someCondition) {
        println("something")
        50
    } else {
        println("something else")
        592
    }


}
