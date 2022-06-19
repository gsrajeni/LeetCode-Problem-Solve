package easy

fun main() {
    print(
        hasPathSum(
            TreeNode(1, TreeNode(2)), 2
        )
    )
}

fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
    return digPathForSum(root, targetSum, 0)
}

fun digPathForSum(root: TreeNode?, targetSum: Int, currentSum: Int): Boolean {
    var leftSum = false
    var rightSum = false
    var addedSum = currentSum
    if (root == null)
        return false
    addedSum += root.`val`
    if ((root.left == null && root.right == null)) {
        return addedSum == targetSum
    } else {
        leftSum = digPathForSum(root.left, targetSum, addedSum)
        rightSum = digPathForSum(root.right, targetSum, addedSum)
    }
    return leftSum || rightSum
}
