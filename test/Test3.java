package test;

public class Test3 {
    public static void main(String[] args) {
        System.out.print("打印1-100所有整数中的单数: ");
        for (int i = 1;i <= 100;i ++){
            if(i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }
}
