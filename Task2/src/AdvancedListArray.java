public class AdvancedListArray {

    private Node head;
    private Node tail;
    private int size = 0;

    public void add(int elem) {
        Node node = new Node(elem);
        Node currentNode = head;
        if (head == null) {
            head = node;
            tail = node;
            size++;
        } else {
            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
            tail = currentNode.next;
            size++;
        }
    }

    public void add (int elem, int index) {
        Node node = new Node(elem);
        Node currentNode = head;
        for (int i = 1; i < index; i++) {
            currentNode = currentNode.next;
        }
        node.next = currentNode.next;
        currentNode.next = node;
        if (node.next == null) {
            tail = node;
        }
        size++;
    }

    public void delete(int index) {
        if (index == 0) {
            head = head.next;
            size--;
        } else {
            Node currentNode = head;
            for (int i = 1; i < index; i++) {
                currentNode = currentNode.next;
            }
            currentNode.next = currentNode.next.next;
            if (currentNode.next == null) {
                tail = currentNode;
            }
            size--;
        }
    }

    public void set (int elem, int index) {
        Node node = new Node(elem);
        if (index == 0) {
            node.next = head.next;
            head = node;
        } else {
            Node currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
            node.next = currentNode.next;
            currentNode = head;
            for (int i = 1; i < index; i++) {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }
        if (node.next == null) {
            tail = node;
        }
    }

    public int numberOfElements() {
        return size;
    }

    public int getElementByIndex(int index) {
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.elem;
    }

    public void print() {
        Node currentNode = head;
        if (head != null) {
            System.out.println(head.elem);
        }
        while(currentNode.next != null) {
                currentNode = currentNode.next;
                System.out.println(currentNode.elem);
        }
    }

    public boolean contains(Node node){
        boolean contains = false;
    }

}