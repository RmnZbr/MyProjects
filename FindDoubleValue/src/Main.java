import java.util.ArrayList;
import java.util.List;

public class Main {

    private final int[] ARRAY = new int[] {1, 2, 3, 4, 5, 6, 5, 7, 8, 9, -1,};

    public static void main(String[] args) {
    }

    public int findDouble(int[] array) {
        List<Integer> list = createList(array);
        for (int i = 0; i < array.length; i++) {
            if (list.indexOf(array[i]) != list.lastIndexOf(array[i])) {
                return array[i];
            }
        }
        return -1;
    }

    public int findTheOnly(int[] array) {
        List<Integer> list = createList(array);
        for (int i = 0; i < array.length; i++) {
            if (list.indexOf(array[i]) == list.lastIndexOf(array[i])) {
                return array[i];
            }
        }
        return -1;
    }

    private List<Integer> createList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        return list;
    }

    public int findDoubleValue(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return array[i];
                }
            }
        }
        return -1;
    }

    public int findTheOnlyValue(int[] array) {
        int firstEnter;
        int secondEnter;
        for (int i = 0; i < array.length - 1; i++) {
            firstEnter = array[i];
            secondEnter = array[i + 1];
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    continue;
                }
                if (array[i] == array[j]) {
                    secondEnter = array[i];
                }
            }
            if (firstEnter != secondEnter) {
                return firstEnter;
            }
        }
        return -1;
    }
}
