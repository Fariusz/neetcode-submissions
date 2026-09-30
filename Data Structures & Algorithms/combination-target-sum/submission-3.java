class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        backtrack(result, subset, nums, 0, target);

        return result;
    }

    private void backtrack(List<List<Integer>> result,
                           List<Integer> subset,
                           int[] nums,
                           int i,
                           int target) {

        // znaleźliśmy kombinację
        if (target == 0) {
            result.add(new ArrayList<>(subset));
            return;
        }

        // poza tablicą albo przekroczyliśmy target
        if (target < 0 || i >= nums.length) {
            return;
        }

        // wybieramy nums[i]
        subset.add(nums[i]);
        backtrack(result, subset, nums, i, target - nums[i]);

        // cofamy wybór
        subset.remove(subset.size() - 1);

        // pomijamy nums[i]
        backtrack(result, subset, nums, i + 1, target);
    }
}