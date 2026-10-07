class Solution {
    public int searchInsert(int[] nums, int target) {
        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        int middlePointer = (rightPointer + leftPointer) / 2;

        while (leftPointer <= rightPointer) {
            middlePointer = (rightPointer + leftPointer) / 2;

            if (nums[middlePointer] > target) {
                rightPointer = middlePointer-1;
            }

            if (nums[middlePointer] < target) {
                leftPointer = middlePointer+1;
            }

            if (nums[middlePointer] == target) {
                return middlePointer;
            }
        }
        return leftPointer;
    }
}