package easy


fun main() {
    val numArray = NumArray(intArrayOf(-2, 0, 3, -5, 2, -1))
    println(numArray.sumRange(0, 5))
}

class NumArray(
    val array: IntArray? = null
) {
    fun sumRange(left: Int, right: Int): Int {
        if (array != null && left >= 0 && right < array.size && left <= right) {
            var sum = 0
            for (i in left..right) {
                sum += array[i]
            }
            return sum
        }
        return -1
    }
}