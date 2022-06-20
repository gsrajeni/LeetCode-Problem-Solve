package easy

fun main() {
println(addDigits(126))
}
fun addDigits(num: Int): Int {
    return (num-1)%9+1
}