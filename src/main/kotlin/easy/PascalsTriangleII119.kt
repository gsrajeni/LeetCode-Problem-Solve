package easy

fun main() {
    print(getRow(3))
}
fun getRow(rowIndex: Int): List<Int> {
    val triangle = mutableListOf<MutableList<Int>>()
    if(rowIndex >= 0)
    triangle.add(mutableListOf(1))
    if(rowIndex >= 1)
        triangle.add(mutableListOf(1,1))
    if(rowIndex >= 2){
        for(i in 2 .. rowIndex){
            val rowList = mutableListOf<Int>()
            for(j in 0 ..  i){
                if(j == 0 || j == i) rowList.add(1)
                else{
                    val sum = triangle[i-1][j-1] + triangle[i-1][j]
                    rowList.add(sum)
                }
            }
            triangle.add(rowList)
        }
    }
    return triangle.last() ?: mutableListOf()
}
