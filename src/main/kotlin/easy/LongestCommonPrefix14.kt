package easy

fun main() {
    print(longestCommonPrefix(arrayOf("flower", "flow", "flight")))
}

fun longestCommonPrefix(strs: Array<String>): String {
    var commonPrefix = ""
    var finalIndex = Int.MAX_VALUE
    strs.forEach {
        finalIndex = if (it.length < finalIndex) it.length else finalIndex
    }
    run {
        var isCommon = true
        for (i in 0 until finalIndex) {
            val pointerChar = strs.first()[i]
            strs.forEach {
                if (isCommon)
                    isCommon = it[i] == pointerChar
            }
            if (isCommon) commonPrefix += pointerChar
            else return@run
        }
    }
    return commonPrefix
}