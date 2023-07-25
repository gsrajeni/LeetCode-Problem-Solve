package easy.`434`

fun main() {
    print(countSegments("        sedrfsdf        "))
}
fun countSegments(s: String): Int {
    if(s.isEmpty()) return 0
    var segment = 0
    s.forEachIndexed { index, c ->
        if((index == 0 || s[index - 1] == ' ') && s[index] != ' ')
            segment++
    }
    return segment
}
