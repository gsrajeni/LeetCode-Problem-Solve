package blind75

fun main() {
print(productExceptSelf(intArrayOf(-1,1,0,-3,3)).toList())
}
fun productExceptSelf(nums: IntArray): IntArray {
    val outputArray = IntArray(nums.size)
    nums.forEachIndexed { index, _ ->
        var newVal = 1
            for (j in nums.indices){
                if(j != index)
                newVal *= nums[j]
            }
        outputArray[index] = newVal
    }
    return outputArray
}