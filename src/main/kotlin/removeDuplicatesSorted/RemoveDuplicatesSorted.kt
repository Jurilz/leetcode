package removeDuplicatesSorted

class RemoveDuplicatesSorted {

    companion object {
        fun removeDuplicates(nums: IntArray): Int {
            var newIndex = 0
            var lastElement = nums[0]

            for (i in 0..(nums.size - 2)) {
                if (nums[i] < nums[i + 1]) {
                    nums[++newIndex] = nums[i + 1]
                }
            }
            return newIndex + 1
        }
    }
}