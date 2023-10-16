public class AdvancedArray {

    private int size;
    private static final int LENGTH = 100;
    private int[] array;

    public AdvancedArray() {
        this.array = new int[LENGTH];
    }
    public AdvancedArray(int length) {
        this.array = new int[length];
    }

    public void add(int elem) {
        if (size < array.length) {
            array[size++] = elem;
        } else {
            int[] secondArray = new int[array.length * 10];
            for (int i = 0; i < size; i++) {
                secondArray[i] = array[i];
            }
            secondArray[size++] = elem;
            array = secondArray;
        }
    }
    public void add(int elem, int index) {
        int[] secondArray = new int[array.length];
        if (size == array.length) {
            secondArray = new int[array.length * 10];
        }
        if (index == size) {
            this.add(elem);
        }
        if (index < size) {
            for (int i = 0; i < index; i++) {
                secondArray[i] = array[i];
            }
            for (int i = size; i > index; i--) {
                secondArray[i] = array[i - 1];
            }
            secondArray[index] = elem;
            array = secondArray;
            size++;
        }
    }
    public int numberOfElements() {
        return size;
    }
    public int getElementByIndex(int index) {
        return array[index];
    }
    public void set(int elem, int index) {
        array[index] = elem;
    }
    public void delete(int index) {
        int[] secondArray = new int[array.length];
        for (int i = size - 1; i > index; i--) {
            secondArray[i - 1] = array[i];
        }
        for (int i = 0; i < index; i++) {
            secondArray[i] = array[i];
        }
        array = secondArray;
        size--;
    }
}