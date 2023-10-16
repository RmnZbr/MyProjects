import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AdvancedArray array1 = new AdvancedArray(5);
        for (int i = 0; i < 4; i++) {
            array1.add(i);
        }
        array1.add(8,0);
        array1.add(7,0);
    }
}
