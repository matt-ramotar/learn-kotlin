import java.util.Stack

open class BinaryTree(value: Int) {
    var value = value
    var left: BinaryTree? = null
    var right: BinaryTree? = null
}

open class Level(root: BinaryTree?, depth: Int) {
    val root = root
    val depth = depth
}

fun nodeDepths(root: BinaryTree): Int {
    var sumOfDepths = 0
    val stack = Stack<Level>()
    stack.add(Level(root, 0))

    while (stack.size > 0) {
        val top = stack.pop()
        val node = top.root
        val depth = top.depth
        
        if (node == null) continue

        sumOfDepths += depth

        stack.add(Level(node.left, depth + 1))
        stack.add(Level(node.right, depth + 1))
    }

    return sumOfDepths
}