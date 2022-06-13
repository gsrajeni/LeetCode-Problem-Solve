package easy

import java.math.BigInteger

fun main() {
print(mySqrt(2147483647))
}
fun mySqrt(x: Int): Int {
    for(i in 1 .. x){
        val mult = i.toBigInteger() * i.toBigInteger()
        if(mult == x.toBigInteger()){
            return i
        }
        else if(mult > x.toBigInteger()){
            return i-1
        }
    }
    return 0
}
