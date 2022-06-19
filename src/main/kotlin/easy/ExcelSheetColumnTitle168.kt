package easy

fun main() {
    print(convertToTitle(701))
}
fun convertToTitle(c: Int): String {
    var columnNumber = c
    var title = ""
    while(columnNumber > 0){
        columnNumber --
        title = 'A'.plus(columnNumber % 26) + title
        columnNumber /=26
    }
    return title
}