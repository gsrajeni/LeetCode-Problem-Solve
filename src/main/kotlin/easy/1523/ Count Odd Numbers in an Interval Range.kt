package easy.`1523`

fun main() {
    print(countOdds(4,
        7))
}
fun countOdds(low: Int, high: Int): Int {
    return if(low % 2 == 0 && high % 2 == 0) (high - low) /2
    else (high - low) / 2 + 1
}