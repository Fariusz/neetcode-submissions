class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        if(k == 0) return false;

        for (int R = 0; R < nums.length; R++) {
            int L = Math.abs(R - k);

            if (set.contains(nums[R])) {
                return true;
            }

            if (set.size() >= k) {
                set.remove(nums[L]);
                set.add(nums[R]);

            } else {
                set.add(nums[R]);
            }
        }

        return false;
    }
}