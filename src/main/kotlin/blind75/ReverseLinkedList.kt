package blind75

import easy.ListNode

fun main() {
    var head = reverse(ListNode(1, ListNode(2, ListNode(3,ListNode(4)))))
    while (head != null){
        println(head.`val`)
        head = head.next
    }
}
fun reverse(head: ListNode?): ListNode?{
    var prev: ListNode? = null
    var current:ListNode? = head
    var next:ListNode? = null
    while (current != null){
        next = current.next
        current.next = prev
        prev = current
        current = next
    }
    return prev
}