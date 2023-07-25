package easy.`441`

fun main() {
    print(arrangeCoins(8))
}
fun arrangeCoins(nn: Int): Int {
    var n = nn
    if(n == 0) return 0
    var count = 0
    var i = 1
    while (n >= i){
        n -= i
        count++
        i++
    }
    return count
}