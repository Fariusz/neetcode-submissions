class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0){
            return 0;
        }

        Arrays.sort(nums);

        int currentCounter = 1;
        int maxCounter = 1;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]){
                continue;
            }

            if (nums[i] == nums[i-1] + 1){
                currentCounter++;
            } else {
                currentCounter = 1;
            }

            maxCounter = Math.max(maxCounter, currentCounter);
        }
        return maxCounter;
    }
}
