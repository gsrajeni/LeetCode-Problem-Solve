package easy

fun main() {
    println(isPerfectSquare(0))
}
fun isPerfectSquare(num: Int): Boolean {
    val output = Math.sqrt(num.toDouble())
    return (output % 1) == 0.0
}