package easy

fun main() {

}
fun reverseList(h: ListNode?): ListNode? {
    if(h == null) return null
    var head = h
    val nodelist = mutableListOf<Int>()
    while (head != null) {
        nodelist.add(head.`val`)
        head = head.next
    }
    head = ListNode(nodelist[0])
    populateNode(head, nodelist.asReversed(), 1)
    return head
}

fun populateNode(head: ListNode?, nodelist: MutableList<Int>, i: Int) {
    if(i >=nodelist.size)
        return
    head?.next = ListNode(nodelist[i])
    populateNode(head?.next, nodelist, i+1)
}
