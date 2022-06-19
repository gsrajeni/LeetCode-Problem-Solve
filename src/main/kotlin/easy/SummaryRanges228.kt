package easy

fun main() {
    summaryRanges(intArrayOf(0,1,2,4,5,7))
}
fun summaryRanges(nums: IntArray): List<String> {
    val summaryList = mutableListOf<MutableList<Int>>()
    var startIndex = 0
    nums.forEachIndexed{index, value->
        if(index != nums.size-1) {
            if (value + 1 != nums[index + 1]) {
                summaryList.add(mutableListOf(nums[startIndex], nums[index]))
                startIndex = index + 1
            }
        }
        else summaryList.add(mutableListOf(nums[startIndex], nums[index]))

    }
    val stringList = mutableListOf<String>()
    summaryList.forEach {
        if(it.first() == it.last())
            stringList.add("${it.first()}")
        else stringList.add("${it.first()}->${it.last()}")
    }
    return stringList.toList()
}