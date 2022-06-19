package blind75

import easy.TreeNode

fun main() {
    println(binaryTreeToArray(TreeNode(1, TreeNode(2), TreeNode(3, TreeNode(4), null))))
}
fun binaryTreeToArray(root: TreeNode?):List<Int>{
    return digTree(root)
}

fun digTree(root: TreeNode?): List<Int> {
    val treeList = mutableListOf<Int>()
    if(root == null) treeList
    else{
       treeList.addAll(digTree(root.left))
        treeList.add(root.`val`)
        treeList.addAll(digTree(root.right))
    }
    return treeList
}
