public class SimpleHashMap implements SimpleMap {

    AdvancedArray array;

    public SimpleHashMap() {
        this.array = new AdvancedArray();
    }

    @Override
    public void put(String key, Object value) {
        array.put(key, value);
    }

    @Override
    public Object get(String key) {
        return array.get(key);
    }
}
