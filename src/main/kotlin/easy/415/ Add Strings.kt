package easy.`415`

fun main() {
print(addStrings("199","1"))
}
fun addStrings(num1: String, num2: String): String {
    var i = num1.length-1
    var j = num2.length-1
    var carry = 0;
    val result =  StringBuffer()
    while (i >=0 || j >=0 || carry > 0){
        val digit1 = if(i>= 0)(num1[i]-'0') else 0
        val digit2 = if(j >= 0) (num2[j] - '0') else 0
        val sum = digit1+ digit2 + carry
        carry = sum/10
        val digit = sum % 10
        result.append(digit)
        i--
        j--
    }
    return result.reverse().toString()
}