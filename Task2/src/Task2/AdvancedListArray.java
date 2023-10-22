package Task2;

public class AdvancedListArray {

    private Node head;
    private Node tail;
    private int size = 0;

    public void add(int elem) {
        Node node = new Node(elem);
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

    public void add(int elem, int index) {
        Node node = new Node(elem);
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
                add(elem);
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

    public void set(int elem, int index) {
        Node node = new Node(elem);
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
        return currentNode.elem;
    }

    public boolean contains(int elem) {
        Node node = new Node(elem);
        Node currentNode = head;
        for(int i = 0; i < size; i++) {
            if(currentNode.equals(node)) {
            return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public void addIfNotExist(int elem) {
        if(contains(elem)) {
            System.out.println("The element exists in the array, the element has not been added.");
        } else {
            add(elem);
        }
    }

}