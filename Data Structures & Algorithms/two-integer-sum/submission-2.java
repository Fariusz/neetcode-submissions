class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            list.add(num);
        }

        for (int i = 0; i < list.size(); i++) {
            int complement = target - list.get(i);

            int j = list.subList(i + 1, list.size()).indexOf(complement);

            if (j != -1) {
                return new int[] {i, i + 1 + j};
            }
        }

        return new int[]{};
    }
}