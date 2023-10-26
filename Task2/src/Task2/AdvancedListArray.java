package Task2;

public class AdvancedListArray {

    private Node head;
    private Node tail;
    private int size = 0;

    static class Node {

        public int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void add(int value) {
        Node node = new Node(value);
        if(head == null) {
            head = node;
            tail = node;
            size++;
        } else {
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public void add(int value, int index) {
        Node node = new Node(value);
        if(index == 0) {
            node.next = head;
            head = node;
            size++;
        } else {
            Node currentNode = head;
            for(int i = 1; i < index; i++) {
                currentNode = currentNode.next;
            }
            if(currentNode == tail) {
                add(value);
            } else {
                node.next = currentNode.next;
                currentNode.next = node;
                size++;
            }
        }
    }

    public void delete(int index) {
        if(index == 0) {
            head = head.next;
            size--;
        } else {
            Node currentNode = head;
            for(int i = 1; i < index; i++) {
                currentNode = currentNode.next;
            }
            currentNode.next = currentNode.next.next;
            if(currentNode.next == null) {
                tail = currentNode;
            }
            size--;
        }
    }

    public void set(int value, int index) {
        Node node = new Node(value);
        if(index == 0) {
            node.next = head.next;
            head = node;
        } else {
            Node currentNode = head;
            for(int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
            node.next = currentNode.next;
            currentNode = head;
            for(int i = 1; i < index; i++) {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }
        if(node.next == null) {
            tail = node;
        }
    }

    public int numberOfElements() {
        return size;
    }

    public int getElementByIndex(int index) {
        Node currentNode = head;
        for(int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.value;
    }

    public boolean contains(int value) {
        Node currentNode = head;
        for(int i = 0; i < size; i++) {
            if(currentNode.value == value) {
            return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public void addIfNotExist(int value) {
        if(contains(value)) {
            System.out.println("The element exists in the array, the element has not been added.");
        } else {
            add(value);
        }
    }
}