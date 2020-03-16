package sec3;


import java.util.ArrayList;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("张三",18,80,"1班"));
        list.add(new Student("李四",19,100,"1班"));
        list.add(new Student("王五",17,59,"1班"));
        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("赵六",18,85,"2班"));
        list2.add(new Student("刘七",19,93,"2班"));
        list2.add(new Student("孙八",17,55,"2班"));
        List<Student> list3 = new ArrayList<>();
        list3.addAll(list);
        list3.addAll(list2);
        System.out.println("整合两个list学生信息成一个新的list:");
        for (Student s : list3) {
            System.out.println(s);
        }
        System.out.println("按照分数给出学生信息排名:");
        for (int i = 0; i <list3.size()-1 ; i++) {
            for (int j = 0; j < list3.size()-1-i; j++) {
                Student s1 = list3.get(j);
                Student s2 = list3.get(j+1);
                if (s1.getScore()<s2.getScore()){
                      list3.set(j,s2);
                      list3.set(j+1,s1);
                }
            }
        }
        for (Student s : list3) {
            System.out.println(s);
        }
        System.out.println("输出不及格的学生信息:");
        for (Student s : list3) {
            if (s.getScore()<60){
                System.out.println(s);
            }
        }
        System.out.println("查找张三的信息:");
        for (Student s : list3) {
            if("张三".equals(s.getName())){
                System.out.println(s);
            }
        }
        System.out.println("从list剔除年龄大于18岁的学生信息:");
        List<Student> list4 = new ArrayList<>();
        for (Student s : list3) {
            if (s.getAge()>18){
                list4.add(s);
            }
        }
        list3.removeAll(list4);
        for (Student s : list3) {
            System.out.println(s);
        }
    }
}

