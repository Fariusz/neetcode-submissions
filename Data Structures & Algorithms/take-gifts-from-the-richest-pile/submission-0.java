class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (long gift : gifts) {
            pq.add(gift);
        }

        for (int i = 0; i < k; i++) {
            Long gift = pq.poll();
            gift = (long) Math.floor(Math.sqrt(gift));
            pq.add(gift);
        }

        long result = 0;

        while(!pq.isEmpty()){
            result += pq.poll();
        }

        return result;
    }
}