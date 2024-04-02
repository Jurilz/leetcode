package mergeSortedArrays

class MergeSorted {

    companion object {
        fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
            var lastElementPosFirst = m - 1
            var lastElementPosSecond = n - 1
            var index = m + n - 1 // index to fill the merged array

            // Iterate until there are elements in both arrays
            while (lastElementPosFirst >= 0 && lastElementPosSecond >= 0) {
                val a = nums1[lastElementPosFirst]
                val b = nums2[lastElementPosSecond]

                if (a > b) {
                    nums1[index--] = a // Place a at the end of nums1
                    lastElementPosFirst--
                } else {
                    nums1[index--] = b // Place b at the end of nums1
                    lastElementPosSecond--
                }
            }

            // If there are remaining elements in nums2, copy them to nums1
            while (lastElementPosSecond >= 0) {
                nums1[index--] = nums2[lastElementPosSecond--]
            }
        }
    }

}