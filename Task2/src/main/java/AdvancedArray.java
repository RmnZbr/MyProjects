public class AdvancedArray implements SimpleMap {

    private static final int DEFAULT_SIZE = 16;

    private int size;
    private Node[] array;

    public AdvancedArray() {
        this.array = new Node[DEFAULT_SIZE];
    }

    @Override
    public void put(String key, Object value) {
        Node node = new Node(key, value);
        if (array[indexForObject(key)] == null) {
            array[indexForObject(key)] = node;
            size++;
            if (size / array.length * 100 >= 75) {
                Node[] secondArray = new Node[array.length * 2];
                for (int i = 0; i < array.length; i++) {
                    secondArray[i] = array[i];
                }
                array = secondArray;
            }
        } else {
            Node currentNode = array[indexForObject(key)];
            do {
                if (node.hashCode() != currentNode.hashCode()) {
                    if (currentNode.next == null) {
                        currentNode.next = node;
                        break;
                    } else {
                        currentNode = currentNode.next;
                    }
                } else {
                    if (node.equals(currentNode)) {
                        currentNode.value = value;
                        break;
                    } else {
                        if (currentNode.next == null) {
                            currentNode.next = node;
                            break;
                        } else {
                            currentNode = currentNode.next;
                        }
                    }
                }
            } while (currentNode != null);
        }
    }

    @Override
    public Object get(String key) {
        Node node = new Node(key, null);
        if (array[indexForObject(key)] == null) {
            return "HashMap don`t have this key, please enter correct key";
        }
        if (array[indexForObject(key)].hashCode() == node.hashCode() && array[indexForObject(key)].equals(node)) {
            return array[indexForObject(key)].value;
        } else {
            Node currentNode = array[indexForObject(key)].next;
            do {
                if (currentNode.hashCode() != node.hashCode()) {
                    currentNode = currentNode.next;
                } else {
                    if (currentNode.equals(node)) {
                        return currentNode.value;
                    } else {
                        currentNode = currentNode.next;
                    }
                }

            } while (currentNode != null);
        }
        return "HashMap don`t have this key, please enter correct key";
    }

    public int indexForObject(String key) {
        int hashCode = key.hashCode() % array.length;
        if (hashCode >= 0) {
            return hashCode;
        }
        return hashCode + -2 * hashCode;
    }
}