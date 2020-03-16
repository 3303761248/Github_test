package test;

public class Test {
    public static void main(String []args){
        System.out.print("1+2+3+···+100的和为: ");
        int sum=0;
        for (int i = 1;i <= 100;i ++){
            sum += i;
        }
       System.out.println(sum);
    }
}
