package easy

import java.math.BigInteger

fun main() {
    println(isPowerOfThree(1162261467))
}


fun isPowerOfThree(n: Int): Boolean {
    if(n == 0) return false
    var currentValue:BigInteger = BigInteger.valueOf(1)
   while (currentValue* BigInteger.valueOf(3) <= n.toBigInteger()){
       currentValue *= BigInteger.valueOf(3)
   }
    return currentValue == n.toBigInteger()
}