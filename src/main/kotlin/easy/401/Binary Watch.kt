package easy.`401`

fun main() {
    print(readBinaryWatch(1))
}

fun readBinaryWatch(turnedOn: Int): List<String> {
    val combination = mutableListOf<String>()
    for (i in 0..11) {
        for (j in 0..59) {
            val lightCount =
                Integer.toBinaryString(i).count { a -> a == '1' } + Integer.toBinaryString(j).count { a -> a == '1' }
            if(lightCount == turnedOn){
                combination.add(String.format("%s:%02d", i, j))
            }
        }
    }
    return combination
}