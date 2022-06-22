package easy

fun main() {
println(intersect(intArrayOf(1,2,2,1), intArrayOf(2,2)).toList())
}
fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val list = hashMapOf<Int, Int>()
    nums1.forEach {a->
        if(!list.containsKey(a)) {
            val firstCount = nums1.count { it == a }
            val secondCount = nums2.count { it == a }
            list.put(a, Math.min(firstCount, secondCount))
        }
    }
    val returnList = mutableListOf<Int>()
    list.forEach {
        for(i in 0 until it.value){
            returnList.add(it.key)
        }
    }
    return returnList.toIntArray()
    
}