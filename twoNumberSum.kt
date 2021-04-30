fun twoNumberSum(array: MutableList<Int>, targetSum: Int): List<Int> {
    val nums = mutableMapOf<Int, Boolean>()
    for (num in array) {
        val potentialMatch = targetSum - num
        if (nums.containsKey(potentialMatch)) {
            return listOf<Int>(potentialMatch, num)
        } else {
            nums[num] = true
        }
    }
    return listOf<Int>()
}
