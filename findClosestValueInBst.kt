import kotlin.math.abs

open class BST(value: Int) {
    var value = value
    var left: BST? = null
    var right: BST? = null
}

fun findClosestValueInBst(tree: BST, target: Int): Int {
    return helper(tree, target, tree.value)
}

fun helper(tree: BST, target: Int, closest: Int): Int {
	var newClosest = closest

	if (abs(target - closest) > abs(target - tree.value)) {
		newClosest = tree.value
	}

	if (target < tree.value && tree.left != null) {
		return helper(tree.left!!, target, newClosest)

	} else if (target > tree.value && tree.right != null) {
		return helper(tree.right!!, target, newClosest)
	} else {
		return newClosest
	}
}
