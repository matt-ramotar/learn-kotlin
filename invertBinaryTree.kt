import java.util.ArrayDeque

fun invertBinaryTree(tree: BinaryTree) {
 val  queue = ArrayDeque<BinaryTree>()

 queue.add(tree)

  while (queue.isNotEmpty()) {
    val cur = queue.pollFirst()

    swapLeftAndRight(cur)

    if (cur.left != null) queue.addLast(cur.left)
    if (cur.right != null) queue.addLast(cur.right)
  }
}

fun swapLeftAndRight(tree: BinaryTree) {
  tree.left = tree.right.also { tree.right = tree.left}
}
