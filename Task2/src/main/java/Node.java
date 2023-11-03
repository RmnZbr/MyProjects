public class Node {

    public Object value;
    public String key;
    Node next;

    public Node(String key, Object value) {
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
