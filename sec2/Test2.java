package sec2;

public class Test2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 5, 5, 5, 5, 6, 7, 8, 9};
        int j = 0, count = 0;
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 5) {
                b[j++] = a[i];
                count++;
            }
        }
        System.out.println("数组{1,2,3,4,5,5,5,5,5,6,7,8,9}，去掉数组中的5 生成新的数组: ");
        for (int i = 0; i < count; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
