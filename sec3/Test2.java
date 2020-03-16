package sec3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        Map<String,String>  map =new HashMap<>();
        map.put("a","a");
        map.put("b","b");
        map.put("c","c");
        Map<String,String>  map2 =new HashMap<>();
        map2.put("d","d");
        map2.put("e","e");
        map2.put("f","f");
        map.putAll(map2);
        map.containsKey("a");
//        System.out.println(map2.get("g"));
        Set<String> keys = map2.keySet();
        for (String key : keys) {
            System.out.println(key+":"+map.get(key));
        }
        /*for (String s : map.keySet()) {
            System.out.println(s);
        }
        for (String s : map.values()) {
            System.out.println(s);
        }
        for (String s : map2.keySet()) {
            System.out.println(s);
        }
        for (String s : map2.values()) {
            System.out.println(s);
        }
*/
    }
}
