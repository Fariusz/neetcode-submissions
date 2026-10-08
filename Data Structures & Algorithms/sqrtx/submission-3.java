class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int middle = (left + right) / 2;

        while (left <= right) {
            middle = (left + right) / 2;
            long square = (long) middle * middle;

            if (square > x){
                right = middle - 1;
            }
            if (square < x){
                left = middle + 1;
            }
            if (square == x){
                return middle;
            }
        }
        return right;
    }
}