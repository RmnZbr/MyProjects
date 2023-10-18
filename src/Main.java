public class Main {

    public static void main(String[] args) {
        AdvancedArray array1 = new AdvancedArray();
        for (int i = 0; i < 10_000_000; i++) {
            array1.add(i);
        }
    }
}
