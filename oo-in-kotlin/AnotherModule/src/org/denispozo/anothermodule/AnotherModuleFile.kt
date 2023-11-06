package org.denispozo.anothermodule

import org.denispozo.oo.objects.singeltons.CompanyCommunications
import org.denispozo.oo.objects.singeltons.Department.IT
import org.denispozo.oo.objects.singeltons.Department.SALES
import org.denispozo.oo.objects.singeltons.topLevel

fun main() {
    topLevel("Hello From Another File")
    // If set to internal, impossible to use it in a different module
    // println(CompanyCommunications.getCopyrightLine())
    println(IT.getDepartmentInfo())
    println(SALES.getDepartmentInfo())

}
