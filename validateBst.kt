open class BST(value: Int) {
  var value = value
  var left: BST? = null
  var right: BST? = null
}

fun validateBst(tree: BST): Boolean {
  return dfs(tree, Int.MIN_VALUE, Int.MAX_VALUE)
}

fun dfs(node: BST?, minSoFar: Int, maxSoFar: Int): Boolean {
  if (node == null) return true

  if (!(node.value in minSoFar until maxSoFar)) return false

  val leftIsValid = dfs(node.left, minSoFar, node.value)
  val rightIsValid = dfs(node.right, node.value, maxSoFar)

  return leftIsValid && rightIsValid
}
