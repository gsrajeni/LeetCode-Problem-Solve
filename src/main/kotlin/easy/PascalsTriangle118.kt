package easy

fun main() {
    print(generate(3))
}

fun generate(numRows: Int): List<List<Int>> {
    val triangle = mutableListOf<MutableList<Int>>()
    if (numRows >= 1)
        triangle.add(0, mutableListOf(1))
    if (numRows >= 2)
        triangle.add(1, mutableListOf(1, 1))
    if (numRows >= 3)
        for (i in 2 until numRows) {
            val valueList = mutableListOf<Int>()
            for (j in 0..i) {
                when (j) {
                    0 -> valueList.add(1)
                    i -> valueList.add(1)
                    else -> {
                        val sum = triangle[i - 1][j - 1] + triangle[i - 1][j]
                        valueList.add(sum)
                    }
                }
            }
            triangle.add(valueList)
        }
    return triangle
}