package easy.`461`

import kotlin.math.pow

fun main() {
    print(hammingDistance(1,4))
}
fun hammingDistance(x: Int, y: Int): Int {
    println("binary: ${Integer.toBinaryString(x)}")
    println("binary: ${Integer.toBinaryString(y)}")
    return  Integer.lowestOneBit(x.toDouble().pow(y.toDouble()).toInt())
}