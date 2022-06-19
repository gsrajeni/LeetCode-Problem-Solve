package easy

fun main() {
    print(isHappy(21))
}
fun isHappy(n: Int): Boolean {
    var myNumber = n
    var count = 0
    while (myNumber != 1) {
        count++
        val digitList = mutableListOf<Int>()
        myNumber.toString().forEach {
            digitList.add(it.toString().toInt())
        }
        var sumofSquares = 0
        digitList.forEach {
            sumofSquares += Math.pow(it.toDouble(), 2.0).toInt()
        }
        myNumber = sumofSquares
        if(count > 10) break
    }
    return myNumber == 1
}