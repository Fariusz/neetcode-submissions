class Solution {
    int memo[];

    public int tribonacci(int n) {
        if (n < 0) return 0;

        memo = new int[n];
        return calculateT(n);
    }

    private int calculateT(int n) {
        if (n == 2 || n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }

        if (memo[n - 1] != 0) {
            return memo[n - 1];
        }

        memo[n - 1] = calculateT(n - 1) + calculateT(n - 2) + calculateT(n - 3);
        return memo[n - 1];
        }
    }