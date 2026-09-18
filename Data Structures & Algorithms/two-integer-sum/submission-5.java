class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        int aktualna = 0;
        int szukana = 0;

        for (int i = 0; i < nums.length; i++) {
            aktualna = nums[i];
            szukana = target - nums[i];

            if (map.containsKey(szukana)){
                return new int[]{map.get(szukana), i};
            }
            
            map.put(aktualna, i);

            // for (int j = i+1; j < nums.length; j++) {
            //     if (nums[j] == szukana) {
            //         return new int[] {i, j};
            //     }
            // }
        }
        return new int[] {};
    }
}