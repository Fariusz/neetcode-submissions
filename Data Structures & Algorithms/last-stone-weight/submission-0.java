class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (Integer stone : stones) {
            queue.offer(stone);
        }

        while (queue.size() > 1) {
            int y = queue.poll();
            int x = queue.poll();
            queue.offer(Math.abs(y - x));
        }
        return queue.poll();
    }
}
