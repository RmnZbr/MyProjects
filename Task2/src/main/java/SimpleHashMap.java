public class SimpleHashMap implements SimpleMap {

    private static final int DEFAULT_SIZE = 16;
    private static final double LOAD_FACTOR = 0.75;

    private int size;
    private Node[] array;

    private static class Node {

        private Object value;
        private String key;
        private Node next;

        private Node(String key, Object value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj instanceof Node) {
                return ((Node) obj).key.equals(key);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.key.hashCode();
        }
    }

    public SimpleHashMap() {
        this.array = new Node[DEFAULT_SIZE];
    }

    private int getIndex(String key, int correctLength) {
        int index = key.hashCode() % correctLength;
        if (index >= 0) {
            return index;
        }
        return -index;
    }
    private void grow() {
        if (size >= array.length * LOAD_FACTOR) {
            Node[] newArray = new Node[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                Node element = array[i];
                while (element != null) {
                    int newIndex = getIndex(element.key, newArray.length);
                    if (newArray[newIndex] == null) {
                        newArray[newIndex] = new Node(element.key, element.value);
                    } else {
                        Node node = new Node(element.key, element.value);
                        node.next = newArray[newIndex];
                        newArray[newIndex] = node;
                    }
                    element = element.next;
                }
            }
            array = newArray;
        }
    }
    private Node searchByNodes (String key, int index) {
        int keyHashCode = key.hashCode();
        Node head = array[index];
        while (head != null) {
            if (head.hashCode() == keyHashCode && head.key.equals(key)) {
                return head;
            }
            head = head.next;
        }
        return null;
    }

    @Override
    public void put(String key, Object value) {
        int index = getIndex(key, array.length);
        if (array[index] == null) {
            array[index] = new Node(key, value);
            size++;
            grow();
        } else {
            if (searchByNodes(key, index) == null) {
                Node node = new Node(key, value);
                node.next = array[index];
                array[index] = node;
            } else {
                searchByNodes(key, index).value = value;
            }
        }
    }
    @Override
    public Object get(String key) {
        if (searchByNodes(key, getIndex(key, array.length)) == null) {
            return null;
        } else {
            return searchByNodes(key, getIndex(key, array.length)).value;
        }
    }
}