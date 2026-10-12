class KthLargest {

    Queue<Integer> q; 
    int size;

    public KthLargest(int k, int[] nums) {
        q = new PriorityQueue<>();
        size = k;

        for(int num : nums){
            add(num);
        }
    }
    
    public int add(int val) {
        if(q.size() < size){
            q.add(val);
        }
        else if (q.size() == size) { 
            if (q.peek() < val){
                q.poll();
                q.add(val);
            }
        }
        else if (q.size() > size){
            return 0;
        }

        return q.peek();
    }
}
