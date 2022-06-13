package easy

fun main() {
print(strStr("hello", ""))
}
fun strStr(haystack: String, needle: String): Int {
    return haystack.indexOf(needle)
}