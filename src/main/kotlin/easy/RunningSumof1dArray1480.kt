package easy

fun main() {
val array = intArrayOf(3,1,2,10,1)
    println(runningSum(array).toList())
}
fun runningSum(nums: IntArray): IntArray {
    for(i in 1 until nums.size){
        nums[i] = nums[i]+nums[i-1]
    }
    return nums
}