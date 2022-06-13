package easy

import org.w3c.dom.NodeList

fun main() {
    val a = ListNode(1)
    val b = ListNode(1)
    a.next = b
    val c = ListNode(3)
    b.next = c
    var head = deleteDuplicates(a)
    while (head != null) {
        println(head.`val`)
        head = head?.next
    }
}

fun deleteDuplicates(h: ListNode?): ListNode? {
    var headPointer = h
    val nodeMap = hashMapOf<Int, Int>()
    while (headPointer != null) {
        nodeMap[headPointer.`val`] = headPointer.`val`
        headPointer = headPointer.next
    }
    var result : ListNode? = null
    var head = result
    nodeMap.toSortedMap().forEach {
        if(result == null) {
            result = ListNode(it.value)
            head = result
        }
        else {
            result?.next = ListNode(it.value)
            result = result?.next
        }
    }
    return head
}