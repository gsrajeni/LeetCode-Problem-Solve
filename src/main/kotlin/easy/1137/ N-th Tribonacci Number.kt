package easy.`1137`

fun main() {
print(tribonacci(25))
}
fun tribonacci(n: Int): Int {
    if (n == 0) return 0
    val tribList = mutableListOf<Int>()
    tribList.add(0)
    tribList.add(1)
    tribList.add(1)
    for (i in 2 until  n){
        tribList.add(tribList[i-1] + tribList[i] + tribList[i-2])
    }
    return tribList.last()
}