val romanMap: HashMap<Char, Int> = hashMapOf(
    'I' to 1,
    'V' to 5,
    'X' to 10,
    'L' to 50,
    'C' to 100,
    'D' to 500,
    'M' to 1000
)
fun isNegative(c: Char, c1: Char): Boolean {
    if(romanMap[c]!! < romanMap[c1]!!){
        return true
    }
    return false
}

fun main() {

    val s: String = "LVIII"
    var intValue = 0
    s.forEachIndexed{ index, value ->
        if(index == s.lastIndex){
            intValue += romanMap[value]!!
            return@forEachIndexed
        }
        if(isNegative(s[index], s[index+1])){
            intValue -= romanMap[value]!!
        }else intValue += romanMap[value]!!
    }
    print(intValue)
}