package easy

fun main() {
    println(intersection(intArrayOf(4,9,5), intArrayOf(9,4,9,8,4)).toList())
}
fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
    val intersectionMap = hashSetOf<Int>()
    nums2.forEach {
        if (nums1.contains(it)) intersectionMap.add(it)
    }
    return intersectionMap.toIntArray()
}