package easy.`567`

fun main() {
    println(checkInclusion(
        "abc",
        "cccbacbbbbaaaa"))
}
fun checkInclusion(s1: String, s2: String): Boolean {
    var inputSum = 0
    s1.forEach {
        inputSum += it - 'a'
    }
    for(i in 0 until s2.length-s1.length+1){
        var outputSum = 0
        s2.substring(i, i+s1.length).forEach {
            outputSum += it - 'a'
        }
        if(inputSum == outputSum) {
            if(s1.toSortedSet() == s2.substring(i, i+s1.length).toSortedSet())
            return true
        }
    }
    return false
}