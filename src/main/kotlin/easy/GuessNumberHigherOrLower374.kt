package easy

fun main() {
println(guessNumber(10))
}
fun guessNumber(n:Int):Int {
    var left = 0
    var right = n
    var mid = left + (right - left)/2
    while (left <= right){
        mid = left + (right - left)/2
        if(guess(mid) == 0) return mid
        else if(guess(mid) == -1){
            right = mid - 1
        }else {
            left = mid +1
        }
    }
    return mid
}
fun guess(num: Int): Int{
    if(num == 6) return 0
    else if(num > 6) return -1
    else return 1
}