import java.lang.reflect.Array;
import java.util.Arrays;

public class AdvancedArray{

    private int length = 0;
    private int numOfElem = 0;
    private int[] array;
    private int[] advArray;

    public static void main(String[] args){
        AdvancedArray array1 = new AdvancedArray();
        array1.add(3);
        array1.add(4);
        array1.add(5);
        array1.add(6);
        array1.add(7);
        array1.add(22,2);
        array1.add(22,1);
        array1.add(22,6);
        array1.add(5,0);
    }
    public AdvancedArray(){
        array = new int[length];
        System.out.println(Arrays.toString(array));
    }
    public AdvancedArray(int length){
        setLength(length);
        array = new int[length];
        System.out.println(Arrays.toString(array));
    }

    public int getNumOfElem(){
        return numOfElem;
    }
    public void setNumOfElem(int numOfElem){
        this.numOfElem = numOfElem;
    }

    public int getLength(){
        return length;
    }
    public void setLength(int length){
        this.length = length;
    }

    private int increaseArray(){
        if (length < numOfElem){
            setLength(length + 1);
        }

        return length;
    }
    private int increaseElem(){
        setNumOfElem(numOfElem + 1);
        return numOfElem;
    }
    private void createNewArray(int length){
        advArray = new int[length];
    }
    private void addElemInArray(int elem){
        if (length > 1) {

            for (int i = 0; i < numOfElem - 1; i++) {
                advArray[i] = array[i];
            }
        }
        advArray[numOfElem - 1] = elem;
        array = advArray;
    }
    private void addElemInArray(int elem, int index){
        if(length == 1 && index == 0){
            advArray[0] = elem;
            array = advArray;
        } if (index == 0) {
            for (int i = numOfElem; i > 1; i--) {
                advArray[i - 1] = array[i - 2];
            }
            advArray[0] = elem;
            advArray[1] = array[0];
            array = advArray;
        } else {

            for(int i = 0; i < index; i++){
                advArray[i] = array[i];
            }
            for(int i = numOfElem; i > index; i--) {
                advArray[i - 1] = array[i - 2];
            }
            advArray[index] = elem;
            array = advArray;
        }
    }

    public void add(int elem){
        this.increaseElem();
        this.increaseArray();
        this.createNewArray(length);
        this.addElemInArray(elem);
        System.out.println(Arrays.toString(array));
    }
    public void add(int elem, int index){
        this.increaseElem();
        this.increaseArray();
        this.createNewArray(length);
        this.addElemInArray(elem, index);
        System.out.println(Arrays.toString(array));
    }

}