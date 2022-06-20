package easy

fun main() {
println(missingNumber(intArrayOf(4,3,2,0)))
}
fun missingNumber(nums: IntArray): Int {
    val totalNumber = (nums.size+1)*(0+nums.size+1)/2
    return totalNumber - nums.sum()
}