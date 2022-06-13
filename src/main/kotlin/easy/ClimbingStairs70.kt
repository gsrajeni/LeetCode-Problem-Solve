package easy

fun main() {
    println(climbStairs(6))
}
fun climbStairs(n: Int): Int {
    var firstNum = 1
    var secondNum = 1
    for(i in 2 .. n){
        val temp = firstNum + secondNum
        firstNum = secondNum
        secondNum = temp
    }
    return secondNum
}