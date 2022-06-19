package blind75

fun main() {
    print(sortAlgo(intArrayOf(5,7,1,0,-12,2,4,7,9,8,4,0,1)).toList())
}
fun sortAlgo(nums: IntArray): IntArray{
    for(i in 0 .. nums.size-2){
        for(j in i+1 until nums.size){
            if (nums[j] >= nums[i]){
                val temp = nums[j]
                nums[j] = nums[i]
                nums[i] = temp
            }
        }
    }
    return nums
}