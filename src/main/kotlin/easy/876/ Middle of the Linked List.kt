package easy.`876`

import easy.ListNode

fun main() {
    var value = middleNode(ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5, ListNode(6)))))))
    while (value != null) {
        println(value.`val`)
        value = value.next
    }
}

fun middleNode(h: ListNode?): ListNode? {
    val list = mutableListOf<ListNode>()
    var head = h
    while (head != null) {
        list.add(head)
        head = head.next
    }

    return list[list.size / 2]
}