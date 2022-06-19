package easy

fun main() {
println(isAnagram("aacc", "ccac"))
}
fun isAnagram(s: String, t: String): Boolean {
    if(s.length != t.length) return false
    for(i in 'a' .. 'z'){
        val sCount = s.count { it-> it == i }
        val stCount = t.count { it-> it == i }
        println("$i -> s: $sCount & $i -> t: $stCount")
        if(sCount != stCount) return false
    }
    return true
}