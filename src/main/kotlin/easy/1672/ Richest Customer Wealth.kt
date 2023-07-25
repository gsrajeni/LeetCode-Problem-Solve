package easy.`1672`

fun main() {
println(maximumWealth(arrayOf(intArrayOf(1,2,3), intArrayOf(3,2,1))))
}
fun maximumWealth(accounts: Array<IntArray>): Int {
var maxWealth = Integer.MIN_VALUE
    accounts.forEach {
        var wealthSum = 0
        it.forEach {it1->
            wealthSum += it1
        }
        if (wealthSum > maxWealth)
            maxWealth = wealthSum
    }
    return maxWealth
}