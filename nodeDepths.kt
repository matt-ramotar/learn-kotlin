class NodeInfo (
	val node: BinaryTree?,
	val depth: Int
)

fun nodeDepths(root: BinaryTree): Int {
    var sumOfDepths: Int = 0
    val stack = mutableListOf(NodeInfo(root, 0))

    while (stack.isNotEmpty()) {
		val nodeInfo = stack.removeAt(0)

		val node = nodeInfo.node
		val depth = nodeInfo.depth

        if (node == null) continue

        sumOfDepths += depth

        stack.add(NodeInfo(node.left, depth + 1))
        stack.add(NodeInfo(node.right, depth + 1))
    }

    return sumOfDepths
}

open class BinaryTree(value: Int) {
    var value = value
    var left: BinaryTree? = null
    var right: BinaryTree? = null
}
