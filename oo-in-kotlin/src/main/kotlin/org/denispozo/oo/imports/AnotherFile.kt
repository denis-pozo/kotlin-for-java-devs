package org.denispozo.oo.imports

import org.denispozo.oo.objects.singeltons.CompanyCommunications as Comm
import org.denispozo.oo.objects.singeltons.Department.HR
import org.denispozo.oo.objects.singeltons.topLevel

fun main() {
    topLevel("Top Level Functions are imported the same way as classes, but adding the function name")
    println(Comm.getCopyrightLine())
    println(HR.getDepartmentInfo())
}
