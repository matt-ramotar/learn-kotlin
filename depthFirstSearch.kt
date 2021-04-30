class Node(val name: String) {
  val children = mutableListOf<Node>()

  fun depthFirstSearch(): List<String> {
    return dfs(mutableListOf())
  }

  fun dfs(array: MutableList<String>): List<String> {
    array.add(name)

    for (child in children) child.dfs(array)

    return array
  }
}
