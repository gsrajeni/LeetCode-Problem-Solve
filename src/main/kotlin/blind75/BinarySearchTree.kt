package blind75
import easy.TreeNode

fun main() {
    println(searchElement(TreeNode(1, TreeNode(2, TreeNode(3), TreeNode(4,TreeNode(5)))), 1))
}
fun searchElement(root: TreeNode?, k: Int): Boolean{
    if(root == null) return false
    if(root.`val` == k) return true
    val leftSearch = searchElement(root.left, k)
    val rightSearch = searchElement(root.right, k)
    return leftSearch || rightSearch
}