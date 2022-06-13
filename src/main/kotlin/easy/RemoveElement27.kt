package easy

fun main() {
    print(removeElement(intArrayOf(0,1,2,2,3,0,4,2), 2))
}
fun removeElement(nums: IntArray, `val`: Int): Int {
    var sum = 0
    var pointer = 0
    for(i in nums.indices){
        if(nums[i] != `val`){
            nums[pointer] = nums[i]
            sum++
            pointer++
        }
    }
    return sum
}