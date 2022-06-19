package blind121

fun main() {
println(solution(mutableListOf(1,2,3), mutableListOf(1,2,3), 31))
}
fun solution(a: MutableList<Int>, b: MutableList<Int>, k: Int): Int {
    var tinyCounter = 0
    var j = a.size-1
    for(i in 0 until a.size){
        if("${a[i]}${b[j]}".toInt() < k) tinyCounter++
        j--
    }
    return tinyCounter
}
