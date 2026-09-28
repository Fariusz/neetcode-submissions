class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (Integer stone : stones) {
            queue.offer(stone);
        }

        while (queue.size() > 1) {

            queue.offer((queue.poll() - queue.poll()));
        }
        return queue.poll();
    }
}
