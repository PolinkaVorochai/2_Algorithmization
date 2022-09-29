package part_2.module_3;

import java.util.Arrays;

//Даны две последовательности a1<=a2<=...<=an и b1<=b2<=...<=bm. Образовать из них новую последовательность
//чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
public class Task_2 {
    public static void main(String[] args) {
        int n = 3;
        int m = 5;
        int[] a = new int[n + m];
        int[] b = new int[m];
        System.out.println("Массив первый:");
        for (int i = 0; i < n; i++) {
            a[i] += 2 * i + 25;
            System.out.print(a[i] + "   ");
        }
        System.out.println();
        System.out.println("Массив второй:");
        for (int i = 0; i < m; i++) {
            b[i] += 3 * i + 15;
            System.out.print(b[i] + "   ");
        }
        System.out.println();
        System.out.println("Два соединенных массива:");
        System.arraycopy(b, 0, a, n, m);
        Arrays.sort(a);

        for (int i = 0; i < m + n; i++) {
            System.out.print(a[i] + "   ");
        }
    }
}
