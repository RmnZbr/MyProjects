package Task3;

public class Task3 {

    int[] array = {1, 3, 8, 2, 1, 9, 11, 4, 7, 17};

    public static void main(String[] args) {
        Task3 test = new Task3();
        test.maxSumOfAscendingNumbers(test.array);
    }

    public int maxSumOfAscendingNumbers(int[] array) {
        int maxSum = 0;
        int currentMaxSum = array[0];
        for(int i = 0; i < array.length - 1; i++) {
            if(array[i] < array[i + 1]) {
                currentMaxSum = currentMaxSum + array[i + 1];
            } else {
                if(currentMaxSum > maxSum) {
                    maxSum = currentMaxSum;
                }
                currentMaxSum = array[i + 1];
            }
        }
        if(currentMaxSum > maxSum) {
            maxSum = currentMaxSum;
        }
        return maxSum;
    }
}
