package easy

fun main() {
    println(
        isSubsequence(
            "b",
            "abc"
        )
    )
}

fun isSubsequence(s: String, t: String): Boolean {
    var currentIndex = 0
    var counter = 0
    s.forEachIndexed { index, c ->
        for (i in currentIndex until t.length) {
            if (c == t[i]) {
                counter++
                currentIndex = i+1
                break
            }
        }
    }
    return counter == s.length
}