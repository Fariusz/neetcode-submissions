class Solution {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> combination = new ArrayList<>();
    int sum = 0;

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        backtrack(nums, target, 0);
        return result;
    }

    private void backtrack(int[] nums, int target, int index) {
        if (sum == target) {
            result.add(new ArrayList<>(combination));
            return;
        }

        if (index >= nums.length || sum > target) {
            return;
        }

        sum += nums[index];
        combination.add(nums[index]);
        backtrack(nums, target, index);

        sum-= nums[index];
        combination.remove(combination.size() - 1);

        backtrack(nums, target, index + 1);
    }
}
