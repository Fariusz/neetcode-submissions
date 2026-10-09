class Solution {
    public int findJudge(int n, int[][] trust) {
        Map<Integer, Integer> incoming = new HashMap<>();
        Map<Integer, Integer> outcoming = new HashMap<>();

        for (int[] row : trust) {
            outcoming.put(row[0], outcoming.getOrDefault(row[0], 0) + 1);
            incoming.put(row[1], incoming.getOrDefault(row[1], 0) + 1);
        }

        for (int person = 1; person <= n; person++) {
            if (incoming.getOrDefault(person, 0) == n - 1 &&
                outcoming.getOrDefault(person, 0) == 0) {
                return person;
            }
        }

        return -1;
    }
}