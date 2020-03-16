package sec3;

import java.util.*;

public class TestStudent2 {
    public static void main(String[] args) {
        Map<Integer, Student> map = new HashMap<>();
        map.put(1, new Student("张三", 18, 80, "1班"));
        map.put(2, new Student("李四", 19, 100, "1班"));
        map.put(3, new Student("王五", 17, 59, "1班"));
        Map<Integer, Student> map2 = new HashMap<>();
        map.put(4, new Student("赵六", 18, 85, "2班"));
        map.put(5, new Student("刘七", 19, 93, "2班"));
        map.put(6, new Student("孙八", 17, 55, "2班"));
        Map<Integer, Student> map3 = new HashMap<>();
        map3.putAll(map);
        map3.putAll(map2);
        System.out.println("整合两个map学生信息成一个新的map:");
        for (Integer key : map3.keySet()) {
            System.out.println(key + ":" +map3.get(key));
        }
        List<Map.Entry<Integer, Student>> list = new ArrayList<Map.Entry<Integer, Student>>(map3.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Integer, Student>>() {
            @Override
            public int compare(Map.Entry<Integer, Student> o1, Map.Entry<Integer, Student> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        System.out.println("按照分数给出学生信息排名:");
        for(Map.Entry<Integer, Student> mapping:list){
            System.out.println(mapping.getKey()+":"+mapping.getValue());
        }
        System.out.println("输出不及格的学生信息:");
        for (Integer key : map3.keySet()) {
            if (map3.get(key).getScore()<60){
                System.out.println(key + ":" +map3.get(key));
            }
        }
        System.out.println("查找张三的信息");
        for (Integer key : map3.keySet()) {
            if ("张三".equals(map3.get(key).getName())){
                System.out.println(key + ":" +map3.get(key));
            }

        }
        System.out.println("从map剔除年龄大于18岁的学生信息:");
        Iterator<Map.Entry<Integer, Student>> it = map3.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer, Student> entry = it.next();
            Integer key = entry.getKey();
            Student value = entry.getValue();
            if(value.getAge()>18){
                it.remove();
            }
        }

        for (Integer key : map3.keySet()) {
            System.out.println(key + ":" +map3.get(key));
        }
    }
}