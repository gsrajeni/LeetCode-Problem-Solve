package easy

fun main() {
    println(isIsomorphic("paper", "title"))
}

fun isIsomorphic(s: String, t: String): Boolean {
    val tmap = hashMapOf<Char, Int>()
    val smap = hashMapOf<Char, Int>()
    if (s.length != t.length) return false
    s.forEachIndexed { index, c ->
        if (tmap.getOrPut(t[index]) { index } != smap.getOrPut(s[index]) { index }) {
           return false
        }
    }
    return true
}