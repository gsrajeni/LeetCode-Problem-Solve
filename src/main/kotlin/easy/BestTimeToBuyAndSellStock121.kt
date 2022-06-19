package easy
import kotlin.math.min

fun main() {
    print(maxProfit(intArrayOf(1,7)))
}
fun maxProfit(prices: IntArray): Int {
    var min = prices[0]
    var maxProfit = 0
    for( i in 1 until prices.size){
        min = min(prices[i], min)
        val currentProfit = prices[i] - min
        maxProfit = Math.max(currentProfit, maxProfit)
    }
    return maxProfit

//    var maxProfit = 0
//    for(i in 0 until prices.size-1){
//        val maxValue = prices.copyOfRange(i+1, prices.size).maxOrNull()
//        for(j in i+1 until  prices.size){
//        if(prices[i] < prices[j]) {
//            maxProfit = max(maxProfit,abs(prices[j] - prices[i]))
//        }
//        }
//    }
//    return maxProfit
}