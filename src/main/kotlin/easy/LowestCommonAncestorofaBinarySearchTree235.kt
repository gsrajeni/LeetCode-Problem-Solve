package easy

fun main() {
}
fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
    return if(root == null) null
    else if(((root.`val` >= p!!.`val` || root.`val` >= q!!.`val`) && (root.`val` <= p.`val` || root.`val` <= q!!.`val`) )){
        root
    }
    else if(root.`val` > p.`val`){
        lowestCommonAncestor(root.left, p,q)
    }
    else lowestCommonAncestor(root.right, p,q)
}