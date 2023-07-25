package easy.`1342`

fun main() {
print(numberOfSteps(14))
}
fun numberOfSteps(n: Int): Int {
    var num = n
    var step = 0
    while (num != 0){
        step++
        if(num % 2 == 0) num /= 2
        else num -= 1
    }
    return step
}