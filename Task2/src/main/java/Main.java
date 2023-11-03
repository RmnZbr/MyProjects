public class Main {

    public static void main(String[] args) {

        SimpleHashMap map = new SimpleHashMap();

        map.put("privet", 0);
        map.put("privet1", "one");
        map.put("privet2", 2);
        map.put("privet3", 3d);
        map.put("privet4", 4f);
        map.put("privet5", 5L);
        map.put("privet6", false);
        map.put("123", 123);
        map.put("777777", 777);

        System.out.println(map.get("privet"));
        System.out.println(map.get("privet1"));
        System.out.println(map.get("privet2"));
        System.out.println(map.get("privet3"));
        System.out.println(map.get("privet4"));
        System.out.println(map.get("privet5"));
        System.out.println(map.get("privet6"));
        System.out.println(map.get("privet7"));
        System.out.println(map.get("123"));
        System.out.println(map.get("777777"));
    }
}
