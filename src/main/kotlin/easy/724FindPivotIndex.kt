package easy

fun main() {
print(pivotIndex(intArrayOf(1,7,3,6,5,6)))
}
fun pivotIndex(nums: IntArray): Int {
    for (i in nums.indices){
        var lefSum = 0
        var rightSum = 0
        for(j in 0 until i){
            lefSum += nums[j]
        }
        for (k in i+1 until nums.size){
            rightSum += nums[k]
        }
        if(lefSum == rightSum) return i
    }
    return -1
}