package easy

import kotlin.math.min

fun main() {
    print(
        minDepth(
            TreeNode(
                2,
                TreeNode(2)
            )
        )
    )
}

fun minDepth(root: TreeNode?): Int {
    return findMinDepth(root, 0)
}

fun findMinDepth(root: TreeNode?, currentDepth: Int): Int {
    var cd: Int = currentDepth
    if (root == null) return cd
    if (root.left == null && root.right == null) return cd + 1
    else {
        cd += 1
        val leftDepth = findMinDepth(root.left, cd)
        val rightDepth = findMinDepth(root.right, cd)
        cd = if (leftDepth == cd)
            rightDepth
        else if (rightDepth == cd)
            leftDepth
        else
            min(leftDepth, rightDepth)
    }
    return cd
}