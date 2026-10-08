class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];

        int i = 0;
        for (int num : nums) {
            ans[i] = num;
            ans[(nums.length + i)] = num;

            i++;
        }

        return ans;
    }
}