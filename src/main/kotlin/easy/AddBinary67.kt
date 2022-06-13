package easy

import java.math.BigInteger
import java.util.StringJoiner
import kotlin.math.pow

fun main() {
    print(addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
        "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"))
}

fun addBinary(a: String, b: String): String {
    var firstValue = BigInteger.valueOf(0)
    var secondValue = BigInteger.valueOf(0)
    a.reversed().forEachIndexed { index, value ->
        if (value != '0') {
            firstValue += BigInteger.valueOf(2).pow(index)
        }
    }
    b.reversed().forEachIndexed { index, value ->
        if (value != '0') {
            secondValue += BigInteger.valueOf(2).pow(index)
        }
    }
    return toBinary(firstValue+secondValue)
}

fun toBinary(myValue: BigInteger): String {
    if (myValue == BigInteger.valueOf(0)) return "0"
    var value = myValue
    var binaryString = ""
    var highestBinary = getHighestBinaryValue(value)
    if (highestBinary > value) highestBinary /= BigInteger.valueOf(2)
    while (highestBinary != BigInteger.valueOf(-1)) {
        binaryString += if (value >= highestBinary) {
            value -= highestBinary
            "1"
        } else {
           if(value == BigInteger.valueOf(0) || binaryString != "")
               "0"
            else ""
        }
        if (highestBinary == BigInteger.valueOf(1)) highestBinary = BigInteger.valueOf(-1)
        else
            highestBinary /= BigInteger.valueOf(2)
    }
    return binaryString
}

fun getHighestBinaryValue(value: BigInteger): BigInteger {
    if(value == BigInteger.valueOf(0)) return BigInteger.valueOf(1)
    var result = BigInteger.valueOf(1)
    while (result <= value) {
        result *= BigInteger.valueOf(2)
    }
    return result
}