package easy

fun main() {

}

fun binaryTreePaths(root: TreeNode?): List<String> {
    if (root?.left == null && root?.right == null) return listOf(root?.`val`.toString())
    val stringList = mutableListOf<String>()
    digTree(stringList, "", root)
    return stringList
}

private fun digTree(ans: MutableList<String>, p: String = "", root: TreeNode?){
    var prefix = p
    if (root == null) return
    prefix+= "${root.`val`}->"
    digTree(ans, prefix, root.left)
    digTree(ans, prefix, root.right)
    if(root.left == null && root.right == null) ans.add("$p${root.`val`}")
}