package easy

fun main() {
    val string = charArrayOf('h','e','l','l','o')
    reverseString(string)
    println(string.toList())
}
fun reverseString(s: CharArray): Unit {
    val mid = (s.size-1)/2
    for(i in 0 .. mid){
        val temp = s[i]
        s[i]= s[s.size-1-i]
        s[s.size-1-i] = temp
    }
}
