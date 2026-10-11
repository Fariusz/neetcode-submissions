class Solution {
    Map<Integer, Boolean> memo = new HashMap<>();

    public boolean canJump(int[] nums) {
        return dfs(nums, 0);
    }

    private boolean dfs(int[] nums, int index) {
        if (memo.containsKey(index)) {
            return memo.get(index);
        }
        if (index >= nums.length - 1) {
            return true;
        }

        for (int jump = 1; jump <= nums[index]; jump++) {
            if (dfs(nums, index + jump)) {
                memo.put(index, true);
                return true;
            }
        }
        memo.put(index, false);

        return false;
    }
}
