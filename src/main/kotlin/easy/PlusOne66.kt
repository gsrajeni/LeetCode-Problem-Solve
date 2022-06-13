package easy

fun main() {
    print(plusOne(intArrayOf(9, 9, 9)).asList())
}

fun plusOne(digits: IntArray): IntArray {
    val newDigits = IntArray(digits.size + if (digits.all { v -> v == 9 }) 1 else 0)
    var carry = 0
    digits[digits.size - 1] += 1
    for (i in digits.size - 1 downTo 0) {
        var newValue = digits[i]
        newValue += carry
        carry = if (newValue / 10 > 0) {
            newValue / 10
        } else {
            0
        }
        newValue %= 10
        newDigits[i] = newValue
    }
    if (carry > 0) newDigits[0] = carry
    return newDigits
}
