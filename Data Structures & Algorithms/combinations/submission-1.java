class Solution {
    List<List<Integer>> result;
    List<Integer> combination;
    int k;
    int n;

    public List<List<Integer>> combine(int n, int k) {
        result = new ArrayList<>();
        combination = new ArrayList<>();
        this.k = k;
        this.n = n;

        backtrack(1);

        return result;
    }

    private void backtrack(int index) {
        if (combination.size() == k) {
            result.add(new ArrayList<>(combination));
            return;
        }
        if (index > n) {
            return;
        }

        combination.add(index);
        backtrack(index + 1);
        combination.remove(combination.size() - 1);
        backtrack(index + 1);
    }
}