package easy.`704`

fun main() {
    print(search(intArrayOf(-1,0,3,5,9,12), 9))
}
fun search(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size-1
    while (left <= right){
        val mid = left + (right - left)/2
        if(nums[mid] == target) return mid
        else if (nums[mid] > target){
            right = mid -1
        }else left = mid + 1
    }
    return  -1
}