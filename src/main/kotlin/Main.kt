import mergeSortedArrays.MergeSorted

fun main(args: Array<String>) {
//    println(findAllSlidingWindows(intArrayOf(1,5,3,2,)))
//    println(findErrorNums(intArrayOf(1,5,3,2,2,7,6,4,8,9)).contentToString())
//    nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    val firstArray = intArrayOf(1,2,3,0,0,0)
    val secondArray = intArrayOf(2,5,6)

    MergeSorted.merge(firstArray, 3, secondArray, 3)

    println(firstArray.contentToString())


}

fun findAllSlidingWindowsMin(num: IntArray): Long {

    var result = 0L
    var startIndex = 0

    while (startIndex < num.size) {
        var endIndex = startIndex
        while (endIndex < num.size) {
            val subArray = num.slice(startIndex..endIndex)
            result += subArray.min()
            endIndex++
        }
        startIndex++
    }
    return result
}


//https://leetcode.com/problems/set-mismatch/submissions/1153487597/?envType=daily-question&envId=2024-01-22
fun findErrorNums(nums: IntArray): IntArray {
    val results = mutableListOf<Int>()

    if (nums.toSet().size == nums.size) {
        return intArrayOf()
    }

    val sortedNums: IntArray = nums.copyOf()
    sortedNums.sort()

    for ((index, num) in sortedNums.withIndex()) {

        if ((index + 1) < sortedNums.size && sortedNums[index + 1] == sortedNums[index])  {
            results.add(sortedNums[index])
            break
        }
    }

    for (i in 1..nums.size) {
        if (!nums.contains(i)) {
            results.add(i)
            break
        }
    }

    return results.toIntArray()
}

