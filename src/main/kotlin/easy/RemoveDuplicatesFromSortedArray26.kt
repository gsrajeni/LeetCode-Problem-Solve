package easy

import java.util.Collections

fun main() {
    print(removeDuplicates(intArrayOf(-3,-1,0,0,0,3,3)))
}

fun removeDuplicates(nums: IntArray): Int {
    val uniqueArray = HashSet<Int>()
    nums.forEachIndexed { index, value ->
        uniqueArray.add(value)
    }
    uniqueArray.sorted().forEachIndexed { key, value ->
        nums[key] = value
    }
    return uniqueArray.size
}