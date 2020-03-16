package sec2;

public class Test3 {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8, 10};
        int sum = 0;
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[sum++] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[sum++] = b[i];
        }
        for (int i = 0; i < c.length - 1; i++) {
            for (int j = 0; j < c.length - 1 - i; j++) {
                if (c[j] > c[j + 1]) {
                    int temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
            }
        }
        System.out.println("数字 a{1,3,5,7,9}  b{2,4,6,8,10},将两个数组合并，并按照从小到大的顺序排序，生成新数组: ");
        for (int num : c) {
            System.out.print(num + " ");
        }
    }
}
