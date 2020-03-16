package sec2;

public class Test5 {
    public static void main(String[] args) {
        String s = "1,2,3,4,5,6,7";
        String[] a = s.split(",");
        System.out.println("字符串“1,2,3,4,5,6,7”，根据“，”分开，将其转化为字符串数组: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
