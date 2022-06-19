package easy

fun main() {
    var h = removeElements(
        ListNode(
            1,
            next = ListNode(
                2,
                next = ListNode(6,
                    next = ListNode(3,
                        next = ListNode(4,
                            next = ListNode(5,
                                next = ListNode(6)))))
            )
        ), 6
    )
    while (h != null) {
        println(h.`val`)
        h = h.next
    }
}

fun removeElements(h: ListNode?, `val`: Int): ListNode? {
    var head = h
    if(head == null) return  null
    while (head != null && head.`val` == `val`){
        head = head.next
    }
    var nextNode = head
    while (nextNode?.next != null){
        if(nextNode.next?.`val` == `val`)
            nextNode.next = nextNode.next?.next
        else nextNode = nextNode.next
    }
    return head
}