package blind75

fun main() {
print(containsDuplicate(intArrayOf(1,2,3,4)))
}
fun containsDuplicate(nums: IntArray): Boolean {
    val numsList = mutableListOf<Int>()
    nums.forEach {
        if(numsList.contains(it)) return true
        else numsList.add(it)
    }
    return false
}