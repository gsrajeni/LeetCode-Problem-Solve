package easy

fun main() {
println(firstBadVersion(1))
}
 fun firstBadVersion(n: Int) : Int {
     val first =1
     val mid = first + (n - first) / 2
     return checkBadVersion(first, n, mid)
}

fun checkBadVersion(first: Int, last: Int, mid: Int): Int {
    if(last < first)
        return -1
    val mid1 = mid+1 + (last - (mid+1))/2
    if(isBadVersion(mid) && !isBadVersion(mid-1)){
        return mid
    }
    return if(!isBadVersion(mid)) checkBadVersion(mid+1, last, mid1)
    else{
        val mid2 = first + (mid-1-first)/2
        checkBadVersion(first, mid-1, mid2)
    }
}

fun isBadVersion(i: Int): Boolean{
    return i >= 1
}
