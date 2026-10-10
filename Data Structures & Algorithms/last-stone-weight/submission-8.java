class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            q.add(stone);
        }

        while (!q.isEmpty()) {
            if (q.size() == 1) {
                return q.peek();
            }
            int stone1 = q.poll();
            int stone2 = q.poll();

            if (stone1 == stone2) {
            }
            if (stone1 > stone2) {
                stone1 = stone1 - stone2;
                q.add(stone1);
            }
        }
        return 0;
    }
}
