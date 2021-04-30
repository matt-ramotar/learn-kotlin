fun minHeightBst(array: List<Int>): BST {
	return buildMinHeightBst(array, 0, array.size - 1)!!
}

fun buildMinHeightBst(array: List<Int>, startIdx: Int, endIdx: Int): BST? {
	if (endIdx < startIdx) return null

	val midIdx = (startIdx + endIdx) / 2
  val midVal = array[midIdx]

	val bst = BST(midVal)

  bst.left = buildMinHeightBst(array, startIdx, midIdx - 1)
	bst.right = buildMinHeightBst(array, midIdx + 1, endIdx)

	return bst
}

open class BST(value: Int) {
    var value = value
    var left: BST? = null
    var right: BST? = null

    fun insert(value: Int) {
        if (value < this.value) {
            if (this.left == null) {
                this.left = BST(value)
            } else {
                this.left!!.insert(value)
            }
        } else {
            if (this.right == null) {
                this.right = BST(value)
            } else {
                this.right!!.insert(value)
            }
        }
    }
}
