package sec3;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("a",12));
        list.add(new Person("b",14));
        list.add(new Person("c",14));
        list.set(0,new Person("c",15));
        list.remove(0);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (Person person : list) {
            System.out.println(person);
        }

    }
}
