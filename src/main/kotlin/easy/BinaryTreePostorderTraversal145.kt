package easy

fun main() {

}
fun postorderTraversal(root: TreeNode?): List<Int> {
    val list = mutableListOf<Int>()
    if(root == null) return list
    list.addAll(postorderTraversal(root.left))
    list.addAll(postorderTraversal(root.right))
    list.add(root.`val`)
    return list
}