class Solution {
    int memo[];

    public int climbStairs(int n) {
        memo = new int[n+1];
        return dfs(0, n);
    }

    private int dfs(int stepsTaken, int n) {
        if (stepsTaken > n)
            return 0;
        if (stepsTaken == n) {
            return 1;
        }
        if(memo[stepsTaken] != 0) return memo[stepsTaken];

        memo[stepsTaken] = dfs(stepsTaken + 1, n) + dfs(stepsTaken + 2, n);

        return memo[stepsTaken];
    }
}
