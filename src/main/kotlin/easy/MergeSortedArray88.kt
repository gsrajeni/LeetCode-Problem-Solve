package easy

fun main() {
merge(intArrayOf(1,2,3,0,0,0), 3, intArrayOf(2,5,6), 3)
}
fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    for((num2Index, i) in (m until m+n).withIndex()){
        nums1[i] = nums2[num2Index]
    }
    nums1.sort()
}