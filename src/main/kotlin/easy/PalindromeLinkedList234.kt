package easy

fun main() {
    println(isPalindrome(ListNode(1, ListNode(2, ListNode(2, ListNode(2))))))
}

fun isPalindrome(h: ListNode?): Boolean {
    var head = h
    val forwardList = mutableListOf<ListNode?>()
    while (head!= null){
        forwardList.add(head)
        head = head.next
    }
    for(i in 0 until forwardList.size/2+1){
        if(forwardList[i]?.`val` != forwardList[forwardList.size-1-i]?.`val`) return false
    }
    return true
}