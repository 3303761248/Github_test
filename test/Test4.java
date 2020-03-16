package test;

public class Test4 {
    public static void main(String[] args) {
        int sum = 0;
        int i, j;
        System.out.print("所有素数: ");
        for (i = 101; i <= 200; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                sum += i;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("素数的和: " + sum);
    }
}