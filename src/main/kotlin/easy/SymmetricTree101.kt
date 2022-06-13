package easy

import com.sun.source.tree.Tree

fun main() {
    print(
        isSymmetric(
            TreeNode(
                1,
                TreeNode(2, left = TreeNode(3), right = TreeNode(4)),
                TreeNode(2, left = TreeNode(4), right = TreeNode(3))
            )
        )
    )
}

fun isSymmetric(root: TreeNode?): Boolean {
    return digSymmetricTree(root?.left, root?.right)
}

fun digSymmetricTree(left: TreeNode?, right: TreeNode?): Boolean {
    if (left == right) return true
    if ((left?.left == null && right?.right != null) || (left?.right == null && right?.left != null))
        return false
    return left?.`val` == right?.`val` &&
            digSymmetricTree(left?.left, right?.right) &&
            digSymmetricTree(right?.left, left?.right)
}
