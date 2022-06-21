package easy

fun main() {
val array = intArrayOf(0,1,0,3,12)
    moveZeroes(array)
    println(array.toList())
}
fun moveZeroes(nums: IntArray) {
    var zeroCount = 0
    for( i in nums.indices){
        if(nums[i] != 0){
            nums[zeroCount++] = nums[i]
        }
    }
    for( i in zeroCount until nums.size)
        nums[i]=0
}