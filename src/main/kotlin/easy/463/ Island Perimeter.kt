package easy.`463`

fun main() {
    print(islandPerimeter(arrayOf(intArrayOf(0,1,0,0), intArrayOf(1,1,1,0), intArrayOf(1,1,0,0))))
}
fun islandPerimeter(grid: Array<IntArray>): Int {
    var ans = 0
    for(i in grid.indices){
        for(j in grid[i].indices){
            if(grid[i][j] == 1){
                ans +=4
            }
            if(j-1 >= 1 && grid[i][j-1] == 1) ans--
            if(j+1 != grid[i].size && grid[i][j+1] == 1) ans--
            if(i-1 >= 0 && grid[i-1][j] == 1) ans--
            if(i+1 != grid.size && grid[i+1][j] == 1) ans--
        }
    }
    return ans
}
