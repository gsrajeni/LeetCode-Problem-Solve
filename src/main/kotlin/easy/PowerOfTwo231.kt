package easy

fun main() {
    println(isPowerOfTwo(0))
}
fun isPowerOfTwo(n: Int): Boolean {
    if(n == 0) return false
    var currentPower = 0
    var finalPowerValue = 0.0
    while (Math.pow(2.0, currentPower.toDouble()) <= n){
        finalPowerValue = Math.pow(2.0, currentPower.toDouble())
        currentPower++
    }
    return n == finalPowerValue.toInt()
}