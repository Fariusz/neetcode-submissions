class Solution {
    public int minimumDifference(int[] nums, int k) {
        
        Arrays.sort(nums);
        int left = 0;
        int right = left + k - 1;

        int minDiff = Integer.MAX_VALUE;

        while(right < nums.length){
            if( (nums[right] - nums[left]) < minDiff){
                minDiff = nums[right] - nums[left];
            }
            left++;
            right = left + k - 1;
        }

        return minDiff;
    }
}