package easy.`733`

fun main() {
    val input = arrayOf(intArrayOf(0,0,0), intArrayOf(0,0,0))
    printImage(input)
    floodFill(input, 0, 0, 0)
}
val set = mutableSetOf<Pair<Int,Int>>()

fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
    return fill(image, sr, sc, image[sr][sc],color)
}
fun fill(image: Array<IntArray>, sr: Int, sc: Int,startingColor:Int, color: Int): Array<IntArray> {
    printImage(image)
    if(invalidCoordinate(image, sr, sc) || set.contains(Pair(sr, sc)) || image[sr][sc] != startingColor) return image
    set.add(Pair(sr, sc))
    if(image[sr][sc] != color){
        image[sr][sc] = color
    }
    fill(image, sr, sc-1, startingColor, color)
    fill(image, sr, sc + 1, startingColor, color)
    fill(image, sr-1, sc, startingColor, color)
    fill(image, sr+1, sc, startingColor, color)
    return image
}

fun printImage(input: Array<IntArray>) {
    println("---------------------------")
    for (i in input.indices){
        for (j in input[i].indices){
            print("${input[i][j]} ")
        }
        println()
    }
}

fun invalidCoordinate(image: Array<IntArray>, sr: Int, sc: Int): Boolean {
    return try {
        image[sr][sc]
        false
    }catch (e: Exception){
        true
    }
}
