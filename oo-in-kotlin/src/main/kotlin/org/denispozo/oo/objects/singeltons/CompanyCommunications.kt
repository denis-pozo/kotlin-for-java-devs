package org.denispozo.oo.objects.singeltons

import java.time.Year

object CompanyCommunications {

    val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks!"
    internal fun getCopyrightLine() = "Copyright \u00A9 $currentYear Our Company. All rights reserved."
}

fun main() {
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())
    println(Department.ACCOUNTING.getDepartmentInfo())
    println(Department.SALES.getDepartmentInfo())
    println(Department.IT.getDepartmentInfo())

}

enum class Department(val fullName: String, val numEmployees: Int) {
    HR("Human Resources", 5), IT("Information Technology", 10), ACCOUNTING("Accounting", 3), SALES("Sales", 20);

    fun getDepartmentInfo() = "The $fullName department has $numEmployees employees"
}

fun topLevel(str: String) = println(str)
