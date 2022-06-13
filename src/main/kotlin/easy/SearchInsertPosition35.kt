package easy


fun main() {
    print(searchInsert(intArrayOf(1, 3, 5, 6), -1))
}

fun searchInsert(nums: IntArray, target: Int): Int {
    return binarySearch(nums, 0, nums.size, target)
}

fun binarySearch(nums: IntArray, low: Int, high: Int, target: Int): Int {
    var start = low
    var end = high
    var mid = low + ((high - low) / 2)
    var found = false
    while (!found) {
        if (nums[mid] == target) {
            found = true
        } else if (target > nums.last()) {
            mid = nums.size
            found = true
        } else if (target < nums.first()) {
            mid = 0
            found = true
        } else if (nums[mid] > target && nums[mid - 1] < target) {
            found = true
        } else if (nums[mid] < target && nums[mid + 1] > target) {
            mid += 1
            found = true
        } else {
            if (nums[mid] > target) {
                end = mid - 1
                mid = start + ((end - start) / 2)
            } else {
                start = mid + 1
                mid = start + ((end - start) / 2)
            }
        }
    }
    return mid
}
