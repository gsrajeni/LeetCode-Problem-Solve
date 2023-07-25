package easy.`448`

fun main() {
    print(findDisappearedNumbers(intArrayOf(4,3,2,7,8,2,3,1)))
}
fun findDisappearedNumbers(nums: IntArray): List<Int> {
    val newList = mutableListOf<Int>()
    nums.forEachIndexed {index, value->
        if(!nums.contains(index+1)){
            newList.add(index+1)
        }
    }
    return newList
}