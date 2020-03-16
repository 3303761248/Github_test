package sec3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        Map<String, Person> map = new HashMap<>();
        map.put("a", new Person("a", 12));
        map.put("b", new Person("b", 14));
        map.put("c", new Person("c", 14));
        map.put("d", new Person("d", 14));
        map.put("e", new Person("e", 14));
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + ":" + map.get(key));
        }
    }
}
