package blind75

fun main() {
    println(solution(mutableListOf(5,4,6)))
}
fun solution(statues: MutableList<Int>): Int {
    return statues.sorted().last() - statues.sorted().first()-statues.size + 1
}
