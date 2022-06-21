package easy

fun main() {
    println(countBits(5).toList())
}

fun countBits(n: Int): IntArray {
    val array = IntArray(n+1)
    for( i in 0 .. n){
        array[i] = Integer.bitCount(i)
    }
    return array
}