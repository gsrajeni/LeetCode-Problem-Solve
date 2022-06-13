package easy

fun main() {
    val a = ListNode(4)
    val b = ListNode(2)
    b.next = a
    var c = ListNode(1)
    c.next = b

    val d = ListNode(4)
    val e = ListNode(3)
    e.next = d
    val f = ListNode(1)
    f.next = e
    var result = mergeTwoLists(c, f)
    while (result != null) {
        print(result.`val`)
        result = result.next
    }
}

fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
    var list1 = l1
    var list2 = l2
    val list = mutableListOf<Int>()
    while (list1 != null && list2 != null) {
        if (list1.`val` < list2.`val`) {
            list.add(list1.`val`)
            list1 = list1.next
        } else {
            list.add(list2.`val`)
            list2 = list2.next
        }
    }

    while (list1 != null) {
        list.add(list1.`val`)
        list1 = list1.next
    }

    while (list2 != null) {
        list.add(list2.`val`)
        list2 = list2.next
    }
    var result : ListNode? = null
    var head = result
    list.forEach {
        if(result == null) {
            result = ListNode(it)
            head = result
        }
        else {
            result?.next = ListNode(it)
            result = result?.next
        }
    }
    return head
}
