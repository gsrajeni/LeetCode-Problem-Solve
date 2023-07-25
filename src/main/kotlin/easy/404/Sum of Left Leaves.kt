package easy.`404`
import easy.TreeNode

fun main() {
    print(sumOfLeftLeaves(TreeNode(3, TreeNode(9), TreeNode(20, TreeNode(15), TreeNode(7)))))
}
fun sumOfLeftLeaves(root: TreeNode?): Int {
    return travarseLeft(0, root?.left) + travarseRight(0, root?.right)
}

fun travarseLeft(i: Int, root: TreeNode?): Int {
    var ii = i;
    if(root?.left != null){
        ii += travarseLeft(i, root.left)
    }
    if(root?.right != null){
        ii+= travarseRight(i, root.right)
    }
    if(root?.left == null && root?.right == null){
        return root?.`val` ?: 0
    }
    return ii
}
fun travarseRight(i: Int, root: TreeNode?): Int {
    var ii = i;
    if(root?.left != null){
        ii += travarseLeft(i, root.left)
    }
    if(root?.right != null){
        ii+= travarseRight(i, root.right)
    }
    if(root?.left == null && root?.right == null){
        return 0
    }
    return ii
}
