class Solution {
    List<Integer> current = new ArrayList<>();
    List<List<Integer>> result = new ArrayList<>();
    Set<Integer> used = new HashSet<>();

    public List<List<Integer>> permute(int[] nums) {
        backtrack(nums);
        return result;
    }

    private void backtrack(int[] nums) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int num : nums) {
            if (!used.contains(num)) {
                current.add(num);
                used.add(num);

                backtrack(nums);

                current.remove(current.size() - 1);
                used.remove(num);
            }
        }
    }
}