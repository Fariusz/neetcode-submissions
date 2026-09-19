class MinStack {
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
        array[currentPosition] = val;
        currentPosition++;
    }

    public void pop() {
        currentPosition--;
    }

    public int top() {
        return array[currentPosition - 1];
    }

    public int getMin() {
        int min = array[0];

        for (int i = 0; i < currentPosition; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
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
