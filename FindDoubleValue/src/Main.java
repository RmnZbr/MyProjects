public class Main {

    private final int[] ARRAY = new int[] {1, 1, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7};

    public static void main(String[] args) {

    }

    public int findDoubleValue(int[] array) {
        int[] sortedArray = new int[array.length];
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
