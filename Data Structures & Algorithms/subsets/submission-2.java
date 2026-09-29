class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        dfs(res, subset, nums, res.size());

        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> subset, int[] nums, int i) {
        if (i >= nums.length) {
            res.add(new ArrayList<>(subset));
            return;
        }

        // add letter
        subset.add(nums[i]);
        dfs(res, subset, nums, i + 1);

        // skip letter
        subset.remove(subset.size() - 1);
        dfs(res, subset, nums, i + 1);
    }
}
