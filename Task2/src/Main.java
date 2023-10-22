public class Main {

    public static void main(String[] args) {

        AdvancedListArray list = new AdvancedListArray();

        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        list.print();
        list.numberOfElements();

    }
}
