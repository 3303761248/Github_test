package sec2;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
     List<String> list=new ArrayList<>();
     list.add("a");
     list.add("b");
     list.add("c");
     list.add("d");
     list.remove("a");
     list.get(0);
     list.set(0,"b");
     list.contains("a");
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
