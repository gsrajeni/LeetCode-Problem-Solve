package easy

fun main() {
    print(inorderTraversal(TreeNode(1, null, TreeNode(2, TreeNode(3), null))))
}

fun inorderTraversal(root: TreeNode?): List<Int> {
    return digTree(root)
}

fun digTree(tree: TreeNode?): List<Int> {
    val returnList = mutableListOf<Int>()

    if (tree?.left != null)
        returnList.addAll(digTree(tree.left))
    if(tree?.`val` == null)
        return returnList
    returnList.add(tree.`val`)
    if (tree.right != null)
        returnList.addAll(digTree(tree.right))
    return returnList
}

class TreeNode(
    var `val`: Int,
    var left: TreeNode? = null,
    var right: TreeNode? = null
) {

}
