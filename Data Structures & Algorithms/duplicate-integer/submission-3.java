class Solution {
    public boolean hasDuplicate(int[] nums) {

    int length = nums.length;
    int currentNumber = 0;

        for(int i = 0; i < length; i++){
            currentNumber = nums[i];

            for(int j = i + 1; j < length; j++){
                if(currentNumber == nums[j])
                {
                    return true;
                }
            }
        }
        return false;
    }

}