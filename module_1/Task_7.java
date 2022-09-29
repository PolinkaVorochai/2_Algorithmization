package part_2.module_1;

import java.util.Arrays;

//Даны действительные числа n a ,a , ,a 1 2  . Найти
//max( , , , ) 1 2 2 2 −1 +1 + + + n n n n a a a a  a a .
public class Task_7 {
    public static void main(String[] args) {
        int[] a = {-5, -8, -9, -157, -13, 81456, 1254, 45, 0, 4587};
        int n = a.length / 2;
        int k = 0;
        int[] a1 = new int[n];
        int i, j;
        for (i = 0, j = a.length - 1; i < n && j >= n; i++, j--) {
            a1[k] = a[i] + a[j];
            k++;
        }
        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(a));
        System.out.println("Новый массив: ");
        System.out.println(Arrays.toString(a1));

        int m = a1[0];
        for (i = 0; i < a1.length; i++) {
            if (m <= a1[i]) {
                m = a1[i];
            }
        }
        System.out.println("Максимальный элемент: " + m);
    }
}

