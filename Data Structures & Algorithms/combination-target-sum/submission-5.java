class Solution {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> subresult = new ArrayList<>();
    int current = 0;

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        backtrack(nums, target, 0);
        return result;
    }

    private void backtrack(int[] nums, int target, int index) {

        if (current == target) {
            result.add(new ArrayList<>(subresult));
            return;
        }

        if (current > target || index == nums.length) {
            return;
        }

        // Biorę nums[index]
        current += nums[index];
        subresult.add(nums[index]);

        // Ten sam index, bo mogę ponownie wziąć tę liczbę
        backtrack(nums, target, index);

        // Cofam wybór
        subresult.remove(subresult.size() - 1);
        current -= nums[index];

        // Nie biorę tej liczby, przechodzę do następnej
        backtrack(nums, target, index + 1);
    }
}