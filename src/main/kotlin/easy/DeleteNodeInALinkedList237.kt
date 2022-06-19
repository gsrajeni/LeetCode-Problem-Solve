package easy

fun main() {
    var listNode: ListNode? = ListNode(2, ListNode(0, ListNode(1, ListNode(3))))
    deleteNode(listNode?.next?.next)
    while (listNode != null) {
        println(listNode.`val`)
        listNode = listNode.next
    }
}

fun deleteNode(node: ListNode?) {
    var referenceNode = node
    referenceNode?.`val` = referenceNode?.next!!.`val`
    referenceNode.next = referenceNode.next!!.next

}