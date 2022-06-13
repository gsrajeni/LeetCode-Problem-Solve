package easy

fun main() {
    print(lengthOfLastWord("Hello World"))
}
fun lengthOfLastWord(s: String): Int {
    val strArray = s.split(" ")
    var lastWord = ""
    for(i in strArray.size-1 downTo 0){
        if(strArray[i] != " " && strArray[i].isNotEmpty()){
            lastWord = strArray[i]
            break
        }
    }
    return lastWord.length
}