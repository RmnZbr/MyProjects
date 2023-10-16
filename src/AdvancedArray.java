import org.omg.CORBA.ObjectHelper;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Arrays;

public class AdvancedArray {

    private int size;
    private static final int LENGTH = 100;
    private int[] array;

//    public int getSize() {
//        System.out.println(size);
//        return size;
//    }

    public AdvancedArray() {
        this.array = new int[LENGTH];
//        System.out.println(Arrays.toString(array));
    }
    public AdvancedArray(int length) {
        this.array = new int[length];
//        System.out.println(Arrays.toString(array));
    }

    public void add(int elem) {
        if (size < this.array.length) {
            this.array[size++] = elem;
        } else {
            int[] secondArray = new int[this.array.length * 10];
            for (int i = 0; i < size; i++) {
                secondArray[i] = this.array[i];
            }
        secondArray[size++] = elem;
        this.array = secondArray;
        }
        System.out.println(Arrays.toString(this.array));
        System.out.println(size);
    }

    public void add(int elem, int index) {
        if (index == size) {
            this.add(elem);
        } else if (index < size && size < array.length) {
            int[] secondArray = new int[array.length];
            for(int i = 0; i < index; i++){
                secondArray[i] = array[i];
            }
            for(int i = size; i > index; i--) {
                secondArray[i] = array[i - 1];
            }
            secondArray[index] = elem;
            array = secondArray;
            size++;
        } else if (index < size && size == array.length) {
            int[] secondArray = new int[array.length * 10];
            for (int i = 0; i < index; i++) {
                secondArray[i] = array[i];
            }
            for(int i = size; i > index; i--) {
                secondArray[i] = array[i - 1];
            }
            secondArray[index] = elem;
            array = secondArray;
            size++;
        }
        System.out.println(Arrays.toString(array));
    }

    public int numberOfElements() {
        return size;

    }
//    private void addElementInArray(int elem, int index) {
//        if (length == 1) {
//            copyOfArray[0] = elem;
//            advancedArray = copyOfArray;
//        } if (index == 0) {
//            for (int i = numOfElem - 1; i > 0; i--) {
//
//                copyOfArray[i] = advancedArray[i - 1];
//            }
//            copyOfArray[0] = elem;
//            advancedArray = copyOfArray;
//        } else {
//            for(int i = 0; i < index; i++){
//                copyOfArray[i] = advancedArray[i];
//            }
//            for(int i = numOfElem; i > index; i--) {
//                copyOfArray[i - 1] = advancedArray[i - 2];
//            }
//            copyOfArray[index] = elem;
//            advancedArray = copyOfArray;
//        }
//    }

//    public void add(int elem) {
//        int arraySize = getSize();
//        if (arraySize == 0)
//        {
//            int[] copyOfArray = new int[array.length * 10];
//
//        }
//
//    }
//
//
//    private int getNumOfElem() {
//        return numOfElem;
//    }
//    private void setNumOfElem(int numOfElem) {
//        this.numOfElem = numOfElem;
//    }
//
//    private int getLength() {
//        return length;
//    }
//    private void setLength(int length) {
//        this.length = length;
//    }
//
//    private int increaseArray() {
//        if (length < numOfElem) {
//            setLength(++length);
//        }
//        return length;
//    }
//    private int increaseNumberOfElemenets() {
//        setNumOfElem(++numOfElem);
//        return numOfElem;
//    }
//    private int decreaseArray() {
//        if (length == numOfElem) {
//            setLength(--length);
//        }
//        return length;
//    }
//    private int decreaseNumberOfElements() {
//        setNumOfElem(--numOfElem);
//        return numOfElem;
//    }
//    private void createNewArray(int length) {
//        copyOfArray = new int[length];
//    }
//    private void addElementInArray(int elem) {
//        if (length > 1) {
//            for (int i = 0; i < numOfElem - 1; i++) {
//                copyOfArray[i] = advancedArray[i];
//            }
//        }
//        copyOfArray[numOfElem - 1] = elem;
//        advancedArray = copyOfArray;
//    }
//    private void addElementInArray(int elem, int index) {
//        if (length == 1) {
//            copyOfArray[0] = elem;
//            advancedArray = copyOfArray;
//        } if (index == 0) {
//            for (int i = numOfElem - 1; i > 0; i--) {
//
//                copyOfArray[i] = advancedArray[i - 1];
//            }
//            copyOfArray[0] = elem;
//            advancedArray = copyOfArray;
//        } else {
//            for(int i = 0; i < index; i++){
//                copyOfArray[i] = advancedArray[i];
//            }
//            for(int i = numOfElem; i > index; i--) {
//                copyOfArray[i - 1] = advancedArray[i - 2];
//            }
//            copyOfArray[index] = elem;
//            advancedArray = copyOfArray;
//        }
//    }
//    private void deleteElementFromArray(int index) {
//        for (int i = numOfElem - 1; i > index; i--) {
//            copyOfArray[i - 1] = advancedArray[i];
//        }
//        for (int i = 0; i < index; i++) {
//            copyOfArray[i] = advancedArray[i];
//        }
//        advancedArray = copyOfArray;
//    }
//
//    public void add(int elem) {
//        this.increaseNumberOfElemenets();
//        this.increaseArray();
//        this.createNewArray(length);
//        this.addElementInArray(elem);
//    }
//    public void add(int elem, int index) {
//        this.increaseNumberOfElemenets();
//        this.increaseArray();
//        this.createNewArray(length);
//        this.addElementInArray(elem, index);
//    }
//    public void delete(int index) {
//        this.decreaseArray();
//        this.createNewArray(length);
//        this.deleteElementFromArray(index);
//        this.decreaseNumberOfElements();
//    }
//    public int numberOfElements() {
//        return numOfElem;
//    }
//    public int getElementByIndex(int index) {
//        return advancedArray[index];
//    }
//    public void set(int elem,int index) {
//        advancedArray[index] = elem;
//    }
}
