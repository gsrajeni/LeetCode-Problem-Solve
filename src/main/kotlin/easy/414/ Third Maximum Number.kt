package easy.`414`

import java.lang.Long.MIN_VALUE


fun main() {
    print(thirdMax(intArrayOf(1,2,-2147483648)))
}
    fun thirdMax(nums: IntArray): Long {
        var firstMax: Long = MIN_VALUE
        var secondtMax: Long = MIN_VALUE
        var thirdMax: Long = MIN_VALUE
        nums.forEach {
            if(it >= firstMax){
                if(it.toLong() != firstMax) {
                    thirdMax = secondtMax
                    secondtMax = firstMax
                    firstMax = it.toLong()
                }
            }else if(it >= secondtMax){
                if(it.toLong() != secondtMax) {
                    thirdMax = secondtMax
                    secondtMax = it.toLong()
                }
            }else if(it >= thirdMax){
                if(it.toLong()!= thirdMax) {
                    thirdMax = it.toLong()
                }
            }
        }
       if(thirdMax == MIN_VALUE || secondtMax == MIN_VALUE) return firstMax
        return thirdMax
    }