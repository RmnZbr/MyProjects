public class Node {

    public int elem;
    Node next;

    public Node(int elem) {
        this.elem = elem;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        Node node = (Node) obj;
        return this.elem == node.elem;
    }
}
