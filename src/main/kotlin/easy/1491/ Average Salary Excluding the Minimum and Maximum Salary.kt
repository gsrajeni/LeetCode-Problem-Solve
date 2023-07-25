package easy.`1491`

import kotlin.math.max

fun main() {
    println(average(intArrayOf(4000, 3000, 1000, 2000)))
}

fun average(salary: IntArray): Double {
    var minSalary = Double.MAX_VALUE
    var maxSalary = Double.MIN_VALUE
    var salarySum = 0.0
    for (i in salary.indices) {
        salarySum += salary[i]
        if (salary[i] <= minSalary) {
            minSalary = salary[i].toDouble()
        }
        if (salary[i] >= maxSalary) {
            maxSalary = salary[i].toDouble()

        }
    }
    return (salarySum - (minSalary + maxSalary)) / (salary.size - 2)
}