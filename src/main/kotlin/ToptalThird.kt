import java.util.Arrays

fun main() {
println(solution("300.01", arrayOf("300.00", "200.00", "100.00")).toList())
}
fun solution(S: String, B: Array<String>): Array<String>{
    var totalExcess = S.toDouble()
    var invoiceList = mutableListOf<Double>()
    var outputList = DoubleArray(B.size)
    B.forEach {
        invoiceList.add(it.toDouble())
    }
    while (invoiceList.sum() > 0.0){
        val currentIndex = invoiceList.indexOf(findTheBiggestOne(invoiceList))
        outputList[currentIndex] = (totalExcess * invoiceList[currentIndex]/invoiceList.sum())
        totalExcess -= outputList[currentIndex]
        invoiceList[currentIndex] = 0.0
    }
    outputList.forEachIndexed {index, value->
        B[index] = String.format("%.2f", value)
    }
    return B
}
fun findTheBiggestOne(array: MutableList<Double>): Double  {
    return array.maxOrNull() ?: 0.0
}
