
class MinStack {

    private final Map<Integer, Integer> minValueMap = new HashMap<>();

    private int min;
    private int currentPosition;
    private int capacity;
    private int[] array;

    public MinStack() {
        capacity = 10;
        array = new int[capacity];
        currentPosition = 0;
    }

    public void push(int val) {
        if (currentPosition == capacity) {
            extendArray();
        }

        if (currentPosition == 0) {
            min = val;
        } else if (val < min) {
            min = val;
        }

        array[currentPosition] = val;
        minValueMap.put(currentPosition, min);

        currentPosition++;
    }

    public void pop() {
        if (currentPosition == 0) {
            throw new EmptyStackException();
        }

        currentPosition--;

        minValueMap.remove(currentPosition);

        if (currentPosition > 0) {
            min = minValueMap.get(currentPosition - 1);
        }
    }

    public int top() {
        if (currentPosition == 0) {
            throw new EmptyStackException();
        }

        return array[currentPosition - 1];
    }

    public int getMin() {
        if (currentPosition == 0) {
            throw new EmptyStackException();
        }

        return min;
    }

    private void extendArray() {
        capacity *= 2;

        int[] newArray = new int[capacity];

        System.arraycopy(
                array,
                0,
                newArray,
                0,
                currentPosition
        );

        array = newArray;
    }
}