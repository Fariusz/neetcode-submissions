class MinStack {
    Map<Integer, Integer> minValueMap = new HashMap<>();
    int min;
    int currentPosition;
    int size;
    int[] array;

    public MinStack() {
        size = 10;
        array = new int[size];
        currentPosition = 0;
    }

    public void push(int val) {
        if (currentPosition == size) {
            extendArray();
        }
        if (currentPosition == 0) {
            min = val;
            minValueMap.put(currentPosition, min);
        }
        if (val < min) {
            min = val;
        }

        array[currentPosition] = val;
        currentPosition++;
        minValueMap.put(currentPosition, min);
    }

    public void pop() {
        if (currentPosition > 0) {
            currentPosition--;
            min = minValueMap.get(currentPosition);
        }
    }

    public int top() {
        return array[currentPosition - 1];
    }

    public int getMin() {
        return min;
    }

    private void extendArray() {
        int oldSize = size;
        size += 10;
        int[] newArray = new int[size];

        for (int i = 0; i < oldSize; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }
}
