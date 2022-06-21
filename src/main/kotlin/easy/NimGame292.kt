package easy

fun main() {
println(canWinNim(4))
}

fun canWinNim(n: Int): Boolean {
    return n%4 != 0
}