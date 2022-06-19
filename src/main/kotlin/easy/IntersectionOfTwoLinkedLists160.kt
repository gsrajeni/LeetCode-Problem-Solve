package easy

class Solution {
    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
        var pointerA: ListNode? = headA
        var pointerB: ListNode? = headB
        while (pointerA != pointerB) {
            pointerA = if (pointerA == null) headB else pointerA.next
            pointerB = if (pointerB == null) headA else pointerB.next
        }
        return pointerA
    }
}

fun main() {
    val solution = Solution()
    solution.getIntersectionNode(
        null//first linked list,
        , null//second linked list
    )
}

class ListNode(var `val`: Int, var next: ListNode? = null) {

}