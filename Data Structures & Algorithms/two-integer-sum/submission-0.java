class Solution {
    public int[] twoSum(int[] nums, int target) {
        int x = 0;
        int y = 1;
    
        while (x < nums.length -1){
            if((nums[x] + nums[y]) == target){
                return new int[]{x, y};
            }
            y++;

            if(y == nums.length){
                x++;
                y = x + 1;
            }
        }
        return new int[]{0,0};
    }
}
