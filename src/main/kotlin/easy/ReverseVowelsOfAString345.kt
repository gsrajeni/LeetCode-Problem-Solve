package easy

fun main() {
println(reverseVowels("race a car"))
}
fun reverseVowels(sp: String): String {
    val charList = sp.split("").toMutableList()
    var forwardIndex = 0
    var backwardIndex = charList.size-1
    while (forwardIndex < backwardIndex){
        if(!isVowel(charList[forwardIndex]) || charList[forwardIndex].contains(" ")){
            forwardIndex++
        }
        if(!isVowel(charList[backwardIndex]) || charList[backwardIndex].contains(" ")){
            backwardIndex--
        }
        if(isVowel(charList[forwardIndex]) && isVowel(charList[backwardIndex])){
            val temp = charList[forwardIndex]
            charList[forwardIndex] = charList[backwardIndex]
            charList[backwardIndex] = temp
            forwardIndex++
            backwardIndex--
        }
    }
    val stringBuffer = StringBuffer()
    return charList.joinTo(stringBuffer, "").toString()
}
fun isVowel(char: String): Boolean{
    return "aeiou".contains(char, ignoreCase = true)
}