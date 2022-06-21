package easy

fun main() {
    println(isPowerOfFour(16))
}
fun isPowerOfFour(n: Int): Boolean {
    if(n == 1) return true
    if(n == 0) return false
    if (n%4 != 0) return false
    return isPowerOfFour(n/4)
}