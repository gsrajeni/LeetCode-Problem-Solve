package medium

fun main() {
    println(shipWithinDays(intArrayOf(1,2,3,4,5,6,7,8,9,10), 5))
}
fun shipWithinDays(weights: IntArray, days: Int): Int {
    val totalWeight = weights.sum()
    var minimumWeight = totalWeight/days
    var currentWeight = 0
    var currentDays = 0
    while (currentDays != days) {
        for (i in weights.indices) {
            if (currentWeight+weights[i] > minimumWeight) {
                currentWeight = weights[i]
                currentDays++
            }
            else if(currentWeight + weights[i] == minimumWeight){
                currentDays++
            }
            else {
                currentWeight += weights[i]
            }
        }
        currentDays++
        if(currentDays != days) {
            currentDays = 0
            currentWeight = 0
            minimumWeight++
        }
    }
    return minimumWeight
}