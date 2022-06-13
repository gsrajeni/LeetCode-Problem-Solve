package easy

fun main() {
    print(
        isSameTree(
            TreeNode(1, TreeNode(2), TreeNode(3)),
            TreeNode(1, TreeNode(2), TreeNode(3))
        )
    )
}

fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
    return digTreeWithNull(p, q)

}

fun digTreeWithNull(tree1: TreeNode?, tree2: TreeNode?): Boolean {
    if (tree1 == tree2) return true
    if ((tree1 != null && tree2 == null) || (tree1 == null && tree2 != null)) return false
    return (tree1?.`val` == tree2?.`val`
            && digTreeWithNull(tree1?.left, tree2?.left)
            && digTreeWithNull(
        tree1?.right,
        tree2?.right
    ))
}
