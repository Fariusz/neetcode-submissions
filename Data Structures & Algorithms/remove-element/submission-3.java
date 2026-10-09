class Solution {
    public int removeElement(int[] nums, int val) {
        int leftP = 0;
        int n = nums.length;
        int rightP = n - 1;

        while (leftP <= rightP) {
            if (nums[leftP] == val) {
                nums[leftP] = nums[rightP];
                nums[rightP] = -1;
                n--;
                rightP--;
            }

            if (nums[leftP] != val) {
                leftP++;
            }
        }

        return n;
    }
}