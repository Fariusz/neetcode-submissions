class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        backtrack(result, subset, nums, result.size());

        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> subset, int[] nums, int i) {
        if (i >= nums.length) {
            result.add(new ArrayList<>(subset));
            return;
        }
        int val = nums[i];
        subset.add(val);

        // dodaje
        backtrack(result, subset, nums, i + 1);
        // nie dodaje
        subset.remove(subset.size() - 1);
        backtrack(result, subset, nums, i + 1);
    }
}
