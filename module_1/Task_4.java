package part_2.module_1;

import java.util.Arrays;

//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
public class Task_4 {
    public static void main(String[] args) {
        double[] a = new double[22];
        double m = -16;
        int index_m = 0;
        double n = 16;
        int index_n = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = Math.random() * 31 - 15;
            System.out.printf("%.2f  ", a[i]);
            if (m <= a[i]) {
                m = a[i];
                index_m = i;
            } else if (n >= a[i]) {
                n = a[i];
                index_n = i;
            }
        }

        a[index_m] = n;
        a[index_n] = m;

        System.out.println();
        System.out.println("После перемены местами максимума и минимума: ");
        System.out.print(Arrays.toString(a));
        System.out.println("Индекс максимального элемента: " + index_m);
        System.out.println("Максимум: " + m);
        System.out.println("Индекс минимального элемента: " + index_n);
        System.out.println("Минимум: " + n);
    }
}
