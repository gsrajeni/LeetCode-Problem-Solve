package easy

fun main() {
print(titleToNumber("AB"))
}
fun titleToNumber(columnTitle: String): Int {
    var value = 0
    columnTitle.reversed().forEachIndexed {index, it->
        val charNumber = it.minus('Z').plus(26)
        value += charNumber * Math.pow(26.0, index.toDouble()).toInt()
    }
    return value
}