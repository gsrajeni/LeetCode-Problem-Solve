package easy

fun main() {
    val x = 121
    print(isPalindrome(x))
}
fun isPalindrome(x: Int): Boolean {
    val xString = x.toString()
    var palString = ""
    for(i in xString.indices){
        palString += xString[xString.length-1 - i]
    }
    return xString == palString
}
