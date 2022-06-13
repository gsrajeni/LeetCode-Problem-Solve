package easy

import kotlin.math.max

fun main() {
    print(
        maxDepth(
            TreeNode(
                1,
                null,
                TreeNode(2)
            )
        )
    )
}

fun maxDepth(root: TreeNode?): Int {
    return digTreeDepth(root, 0)
}

fun digTreeDepth(root: TreeNode?, depth: Int): Int {
    var leftDepth = 0
    var rightDepth = 0
    var newDepth = depth
    if(root == null) return depth
    else{
        newDepth++
         if(root.left != null) {
             leftDepth = digTreeDepth(root.left, newDepth)
         }
        if(root.right != null) {
            rightDepth = digTreeDepth(root.right, newDepth)
        }
    }
    return max(newDepth, max(leftDepth, rightDepth))
}
