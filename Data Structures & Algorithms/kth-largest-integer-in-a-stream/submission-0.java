class KthLargest {
    PriorityQueue<Integer> heap = new PriorityQueue<>();
    Integer element = 0;

    public KthLargest(int k, int[] nums) {
        element = k;

        for (Integer num : nums) {
            heap.offer(num);

            if (heap.size() > k) {
                heap.poll();
            }
        }
    }

    public int add(int val) {
        heap.offer(val);
        if (heap.size() > element) {
            heap.poll();
        }
        return heap.peek();
    }
}
