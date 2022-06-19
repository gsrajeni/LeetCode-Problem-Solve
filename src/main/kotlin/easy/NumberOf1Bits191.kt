package easy

fun main() {
print(hammingWeight(521))
}
fun hammingWeight(n:Int):Int {
  return Integer.toBinaryString(n).replace(Regex("[^1]"), "").length
}