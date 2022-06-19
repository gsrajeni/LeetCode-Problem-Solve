package easy

fun main() {
print(singleNumber(intArrayOf(4,1,2,1,2)))
}
fun singleNumber(nums: IntArray): Int {
    val countMap = mutableListOf<Int>()
    nums.forEach {
        if(countMap.contains(it))countMap.remove(it)
        else countMap.add(it)
    }
    return countMap.first()
}