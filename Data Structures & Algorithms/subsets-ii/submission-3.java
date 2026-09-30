class Solution {

    Set<List<Integer>> result = new HashSet<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> subset = new ArrayList<>();

        Arrays.sort(nums);

        backtrack(result, subset, nums, 0);

        return new ArrayList<>(result);
    }

    private void backtrack(Set<List<Integer>> result, List<Integer> subset, int[] nums, int i) {
        if (i >= nums.length) {
            result.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]);
        backtrack(result, subset, nums, i + 1);
        subset.remove(subset.size() - 1);
        backtrack(result, subset, nums, i + 1);
    }
}
