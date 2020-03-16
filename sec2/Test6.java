package sec2;

public class Test6 {
    public static void main(String[] args) {
        String s = "Hello World!";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'l') {
                count++;
            }
        }
        System.out.println("计算Hello World! 中出现了几次l: " + count);
    }
}
