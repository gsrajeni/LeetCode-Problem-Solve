package easy

fun main() {
    println(preorderTraversal(null))
}

fun preorderTraversal(root: TreeNode?): List<Int> {
    val list = mutableListOf<Int>()
    if (root == null) return list
    list.add(root.`val`)
    list.addAll(preorderTraversal(root.left))
    list.addAll(preorderTraversal(root.right))
    return list
}

