package easy.`455`

fun main() {
    print(findContentChildren(intArrayOf(1,2,3), intArrayOf(1,2)))
}

fun findContentChildren(g: IntArray, s: IntArray): Int {

    var count = 0
    g.sort()
    s.sort()
    var sIndex = 0
    var gIndex = 0
    while (sIndex < s.size && gIndex < g.size){
     if(g[gIndex] > s[sIndex]){
         sIndex++
     }else if(s[sIndex] >= g[gIndex]){
         sIndex++
         gIndex++
         count++
     }
    }
    return count
}