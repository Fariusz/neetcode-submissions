class KthLargest {
    Queue<Integer> q;
    int target;

    public KthLargest(int k, int[] nums) {
        target = k;
        q = new PriorityQueue<>();

        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        if (q.size() >= target) {
            if (val > q.peek()) {
                q.poll();
                q.add(val);
            }
        } else {
            q.add(val);
        }

        return q.peek();
    }
}