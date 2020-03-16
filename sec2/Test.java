package sec2;

public class Test {
    public static void main(String[] args) {
        int[] a = {1, 23, 6, 74, 8, 19, 104};
        int temp, i, j;
        for (i = 0; i < a.length - 1; i++) {
            for (j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("数组排序：{1,23,6,74,8,19,104} 按 从小到大排序: ");
        for (int num : a) {
            System.out.print(num + " ");
        }

    }
}
