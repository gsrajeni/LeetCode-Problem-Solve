package easy.`509`

fun main() {
print(fib(0))
}
fun fib(n: Int): Int {
    if(n == 0) return 0
    val fibList = mutableListOf<Int>()
    fibList.add(0)
    fibList.add(1)
    var i = 1
    while (i < n){
        fibList.add(fibList[i-1] + fibList[i])
        i++
    }
    return fibList.last()
}