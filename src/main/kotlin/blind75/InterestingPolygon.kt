package blind75

fun main() {
    solution(5)
}
fun solution(n: Int): Int {
    if(n == 0) return 0
    var previousSquare = 0
    var currentNumber = 1
    for(i in 1 .. n){
        currentNumber = i*i + previousSquare
        previousSquare = i*i
    }
    return currentNumber
}