class Solution {
    int[] memo;

    public int minCostClimbingStairs(int[] cost) {
        memo = new int[cost.length];
        return Math.min(dfs(cost, 0), dfs(cost, 1));
    }

    private int dfs(int[] cost, int floor) {
        if (floor > cost.length || floor == cost.length) {
            return 0;
        }
        if (memo[floor] != 0){
            return memo[floor];
        }
        
        int oneSteps;
        int twoSteps;

        oneSteps = dfs(cost, floor + 1);
        twoSteps = dfs(cost, floor + 2);


        memo[floor] = cost[floor] + Math.min(oneSteps, twoSteps);
        return memo[floor];
    }
}
