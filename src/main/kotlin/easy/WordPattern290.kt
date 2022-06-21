package easy

import java.util.StringJoiner

fun main() {
    println(wordPattern("abba", "a d d a"))
}

fun wordPattern(pattern: String, s: String): Boolean {
    val replacedHashMap = hashMapOf<Char, String>()
    val stringList = s.split(" ")
    if(pattern.length != stringList.size) return  false
    pattern.forEachIndexed { index, c ->
        if (replacedHashMap.contains(c)) {
            if (stringList[index] != replacedHashMap[c]) return false
        } else {
            if (replacedHashMap.containsValue(stringList[index])) return false
            replacedHashMap[c] = stringList[index]
        }
    }
    println("$s : $pattern")
    return true
}