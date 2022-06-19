package easy

fun main() {
    print(isPalindromeString("0P"))
}
fun isPalindromeString(s: String): Boolean {
    val straightString = s.replace(regex = Regex("[^A-Za-z\\d]"), "")
    return straightString.equals(straightString.reversed(), ignoreCase = true)
}