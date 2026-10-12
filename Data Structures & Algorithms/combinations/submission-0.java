class Solution {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> combination = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }

        backtrack(nums, k, 0);

        return result;
    }

    private void backtrack(int[] nums, int k, int index) {
        if (combination.size() == k) {
            result.add(new ArrayList<>(combination));
            return;
        }
        if (index == nums.length) {
            return;
        }

        combination.add(nums[index]);
        backtrack(nums, k, index + 1);

        combination.remove(combination.size() - 1);
        backtrack(nums, k, index + 1);
    }
}