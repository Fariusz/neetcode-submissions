class Solution {
    Set<List<Integer>> result = new HashSet<>();
    List<Integer> current = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        backtrack(nums, target, 0, 0);
        return new ArrayList<>(result);
    }

    private void backtrack(int[] nums, int target, int index, int sum) {
        if (sum == target) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (sum > target) {
            return;
        }

        if (index >= nums.length) {
            return;
        }

        sum += nums[index];
        current.add(nums[index]);
        backtrack(nums, target, index, sum);
        sum -= nums[index];
        current.remove(current.size() - 1);
        backtrack(nums, target, index + 1, sum);
    }
}
