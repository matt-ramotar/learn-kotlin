import kotlin.math.min

fun minNumberOfCoinsForChange(n: Int, denoms: List<Int>): Int {
    val numOfCoins = MutableList(n + 1) { Int.MAX_VALUE}
    numOfCoins[0] = 0

    var toCompare: Int

    for (denom in denoms) {
        for (amount in 0 until numOfCoins.size) {
            if (denom <= amount) {
                if (numOfCoins[amount - denom] == Int.MAX_VALUE) {
                    toCompare = numOfCoins[amount - denom]
                } else {
                    toCompare = numOfCoins[amount - denom] + 1
                }
                numOfCoins[amount] = min(numOfCoins[amount], toCompare)
            }
        }
    }

    return if (numOfCoins[n] != Int.MAX_VALUE) numOfCoins[n] else -1
}