package easy.`405`

fun main() {
    print(toHex(26))
}

fun toHex(num: Int): String {
    var output = ""
    var n = num
    while (n != 0) {
        val reminder = n % 16
        if(reminder == 15) output = "f$output"
        if(reminder == 14) output = "e$output"
        if(reminder == 13) output = "d$output"
        if(reminder == 12) output = "c$output"
        if(reminder == 11) output = "b$output"
        if(reminder == 10) output = "a$output"
        if(n/16 == 0)
        output= "$reminder$output"
        n -= reminder
        n /= 16
    }
    return output
}