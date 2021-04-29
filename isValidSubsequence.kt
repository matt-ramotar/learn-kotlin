fun isValidSubsequence(array: List<Int>, sequence: List<Int>): Boolean {
    var arrIdx = 0
    var seqIdx = 0

    while (arrIdx < array.size && seqIdx < sequence.size) {
        if (array[arrIdx] == sequence[seqIdx]) seqIdx++
        arrIdx++
    }

    return seqIdx == sequence.size
}