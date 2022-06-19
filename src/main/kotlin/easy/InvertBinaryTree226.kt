package easy

fun main() {

}
fun invertTree(root: TreeNode?): TreeNode? {
    if(root == null) return null
    val temp = root.right
    root.right = root.left
    root.left = temp
    invertTree(root.right)
    invertTree(root.left)
    return root
}