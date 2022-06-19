fun main() {
    val nums = mutableListOf(3,2,4)
    val target = 6
    val indexList = mutableListOf<Int>()
    for(i in 0 until nums.size - 1) {
            for (j in i + 1 until nums.size) {
                if (nums[i] + nums[j] == target) {
                    indexList.add(i)
                    indexList.add(j)
                }
            }
    }
    print(indexList.toString())
}