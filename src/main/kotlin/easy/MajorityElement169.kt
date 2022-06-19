package easy

fun main() {
    print(majorityElement(intArrayOf(-1,1,1,1,2,1)))
}
fun majorityElement(nums: IntArray): Int {
    val majorityContainer = HashMap<Int, Int>()
    nums.forEach{
        majorityContainer[it] = (majorityContainer[it]?:0) + 1
        if(majorityContainer[it]!! > nums.size/2){
            return it
        }
    }
    return 0
}