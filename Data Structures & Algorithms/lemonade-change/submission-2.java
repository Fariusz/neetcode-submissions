class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives = 0;
        int tens = 0;
        int twentys = 0;

        for (int bill : bills) {
            if (bill == 5) {
                fives++;
            }
            if (bill == 10) {
                if (fives > 0) {
                    fives--;
                    tens++;
                } else {
                    return false;
                }
            }
            if (bill == 20) {
                if (fives > 0 && tens > 0) {
                    fives--;
                    tens--;
                    twentys++;
                } else if (fives >= 3) {
                    fives -= 3;
                    twentys++;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
