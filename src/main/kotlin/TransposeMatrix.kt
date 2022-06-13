fun main(){

    print(transpose(arrayOf(intArrayOf(1,2,3), intArrayOf(4,5,6), intArrayOf(7,8,9)))
    )
}
fun transpose(matrix: Array<IntArray>): Array<IntArray> {
    val newMatrix = arrayOf<IntArray>()
    for(i in 0 until matrix.size){
        for(j in 0 until matrix[i].size){
         newMatrix[i][0] = matrix[i][j]
        }
    }
    return newMatrix
}