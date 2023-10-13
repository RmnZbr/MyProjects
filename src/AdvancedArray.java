public class AdvancedArray{

    private int length = 0;
    private int numOfElem = 0;
    private int[] advancedArray;
    private int[] copyOfArray;

    public static void main(String[] args) {
        AdvancedArray array1 = new AdvancedArray();
        for (int i = 0; i < 100; i++) {
            array1.add(i);
        }
    }
    public AdvancedArray() {
        advancedArray = new int[length];
    }
    public AdvancedArray(int length) {
        setLength(length);
        advancedArray = new int[length];
    }

    public int getNumOfElem() {
        return numOfElem;
    }
    public void setNumOfElem(int numOfElem) {
        this.numOfElem = numOfElem;
    }

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    private int increaseArray() {
        if (length < numOfElem) {
            setLength(++length);
        }
        return length;
    }
    private int increaseNumberOfElemenets() {
        setNumOfElem(++numOfElem);
        return numOfElem;
    }
    private int decreaseArray() {
        if (length == numOfElem) {
            setLength(--length);
        }
        return length;
    }
    private int decreaseNumberOfElements() {
        setNumOfElem(--numOfElem);
        return numOfElem;
    }
    private void createNewArray(int length) {
        copyOfArray = new int[length];
    }
    private void addElementInArray(int elem) {
        if (length > 1) {
            for (int i = 0; i < numOfElem - 1; i++) {
                copyOfArray[i] = advancedArray[i];
            }
        }
        copyOfArray[numOfElem - 1] = elem;
        advancedArray = copyOfArray;
    }
    private void addElementInArray(int elem, int index) {
        if (length == 1) {
            copyOfArray[0] = elem;
            advancedArray = copyOfArray;
        } if (index == 0) {
            for (int i = numOfElem - 1; i > 0; i--) {

                copyOfArray[i] = advancedArray[i - 1];
            }
            copyOfArray[0] = elem;
            advancedArray = copyOfArray;
        } else {
            for(int i = 0; i < index; i++){
                copyOfArray[i] = advancedArray[i];
            }
            for(int i = numOfElem; i > index; i--) {
                copyOfArray[i - 1] = advancedArray[i - 2];
            }
            copyOfArray[index] = elem;
            advancedArray = copyOfArray;
        }
    }
    private void deleteElementFromArray(int index) {
        for (int i = numOfElem - 1; i > index; i--) {
            copyOfArray[i - 1] = advancedArray[i];
        }
        for (int i = 0; i < index; i++) {
            copyOfArray[i] = advancedArray[i];
        }
        advancedArray = copyOfArray;
    }

    public void add(int elem) {
        this.increaseNumberOfElemenets();
        this.increaseArray();
        this.createNewArray(length);
        this.addElementInArray(elem);
    }
    public void add(int elem, int index) {
        this.increaseNumberOfElemenets();
        this.increaseArray();
        this.createNewArray(length);
        this.addElementInArray(elem, index);
    }
    public void delete(int index) {
        this.decreaseArray();
        this.createNewArray(length);
        this.deleteElementFromArray(index);
        this.decreaseNumberOfElements();
    }
    public int numberOfElements() {
        System.out.println(numOfElem);
        return numOfElem;
    }
    public int getElementByIndex(int index) {
        return advancedArray[index];
    }
    public void set(int elem,int index) {
        advancedArray[index] = elem;
    }
}
