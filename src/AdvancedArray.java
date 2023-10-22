public class AdvancedArray {

    private static final int DEFAULT_SIZE = 16;

    private int size;
    private int[] array;

    public AdvancedArray() {
        this.array = new int[DEFAULT_SIZE];
    }

    public AdvancedArray(int length) {
        if (length <= 2) {
            this.array = new int[2];
        } else {
            int number = 2;
            for (int i = 2; i < 32; i++) {
                number *= 2;
                if (number / length >= 1) {
                    break;
                }
            }
            this.array = new int[number];
        }
    }

    public void add(int elem) {
        if (size == array.length) {
            int[] secondArray = new int[array.length * 2];
            for (int i = 0; i < size; i++) {
                secondArray[i] = array[i];
            }
            secondArray[size] = elem;
            array = secondArray;
            size++;
        } else {
            array[size++] = elem;
        }
    }

    public void add(int elem, int index){
        if (index == size) {
            this.add(elem);
        } else if (size == array.length) {
            int[] secondArray = new int[array.length * 2];
            for (int i = 0; i < index; i++) {
                secondArray[i] = array[i];
            }
            for (int i = size; i > index; i--) {
                secondArray[i] = array[i - 1];
            }
            secondArray[index] = elem;
            array = secondArray;
            size++;
        } else {
            int[] secondArray = new int[array.length];
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

    public boolean contains(int elem) {
        boolean contains = false;
        for(int i = 0; i < array.length; i++){
            if(array[i] == elem) {
                contains = true;
                break;
            }
        }
        return contains;
    }

    public void addIfNotExist(int elem) {
        if (contains(elem)) {
            System.out.println("The element exists in the array, the element has not been added.");
        } else {
            add(elem);
        }
    }

}