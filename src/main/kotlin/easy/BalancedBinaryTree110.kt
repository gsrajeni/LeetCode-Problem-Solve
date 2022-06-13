package easy

import kotlin.math.abs
import kotlin.math.max
var isBalanced = true
fun main() {

    print(
        isBalanced(
            TreeNode(
                1,
                left = TreeNode(2, TreeNode(3, TreeNode(4), null), null),
                right = TreeNode(2, null, TreeNode(3, null, TreeNode(4)))
            )
        )
    )
}

fun isBalanced(root: TreeNode?): Boolean {
   digTreeForHeight(root)
    return isBalanced
}

fun digTreeForHeight(root: TreeNode?): Int {
    var left = 0
    var right = 0
    if (root == null) return 0
    else {
        left = digTreeForHeight(root.left)
        right = digTreeForHeight(root.right)
        if(abs(left-right) > 1) isBalanced = false
    }
    return max(left, right) + 1
}