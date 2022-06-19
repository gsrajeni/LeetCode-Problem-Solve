package easy

fun main() {

}
fun hasCycle(head: ListNode?): Boolean {
    var headPointer = head
    val valueList = mutableListOf<ListNode>()
    while (headPointer != null){
        valueList.add(headPointer)
        if(valueList.contains(headPointer.next)) {
            return true
        }
        headPointer = headPointer.next
    }
    return false
}