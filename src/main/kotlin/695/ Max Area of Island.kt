package `695`

fun main() {
    println(maxAreaOfIsland(
        arrayOf(
            intArrayOf(0,0,0,0,0,0,0,0),
        )
    ))
}
val visitedCoord = mutableSetOf<Pair<Int,Int>>()
fun maxAreaOfIsland(grid: Array<IntArray>): Int {
    var maxArea = 0
    for (i in grid.indices){
        for(j in 0 until grid[i].size){
            if(!isVisited(i,j) && grid[i][j] == 1){
                maxArea = Math.max(findArea(grid, i,j), maxArea)
            }
        }
    }
    return maxArea
}

fun findArea(grid: Array<IntArray>, i: Int, j: Int): Int {
    var finalCount = 0
    if(isVisited(i,j))return finalCount
    if (isValidCoord(grid, i,j) && grid[i][j] == 1) {
        finalCount++
    }
    visitedCoord.add(Pair(i,j))
    if(isValidCoord(grid, i-1,j) && grid[i-1][j] == 1) finalCount += findArea(grid, i-1, j)
    if(isValidCoord(grid, i,j-1) && grid[i][j-1] == 1) finalCount += findArea(grid, i, j-1)
    if(isValidCoord(grid, i,j+1)  && grid[i][j+1] == 1) finalCount += findArea(grid, i, j+1)
    if(isValidCoord(grid, i+1,j) && grid[i+1][j] == 1) finalCount += findArea(grid, i+1, j)
    return finalCount
}

fun isVisited(x: Int, y:Int): Boolean{
    return visitedCoord.contains(Pair(x,y))
}
fun isValidCoord(grid: Array<IntArray>, x: Int, y:Int): Boolean{
    return try {
        grid[x][y]
        true
    }catch (e: Exception) {
        false
    }
}