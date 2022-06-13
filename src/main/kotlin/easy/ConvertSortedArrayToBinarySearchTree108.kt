package easy

fun main() {

}
fun sortedArrayToBST(nums: IntArray): TreeNode {
    val left = 0
    val right = nums.size-1
    val mid = left + (right - left)/2
    val node = TreeNode(nums[mid])
    node.left = bst(left, mid -1, nums)
    node.right = bst(mid+1, right, nums)
    return node
}

fun bst(left: Int, right: Int, nums: IntArray): TreeNode? {
    if(left > right) return null
    val mid = left + (right - left)/2
    val node  = TreeNode(nums[mid])
    node.left = bst(left, mid-1, nums)
    node.right = bst(mid+1, right, nums)
    return node
}
