package easy

fun main() {
println(canConstruct("aa", "aab"))
}
fun canConstruct(ransomNote: String, magazine: String): Boolean {
    ransomNote.forEach {
        val ransomCount = ransomNote.count {a-> it == a }
        val magazineCount = magazine.count {a-> it == a }
        if(ransomCount > magazineCount) return false
    }
    return true
}