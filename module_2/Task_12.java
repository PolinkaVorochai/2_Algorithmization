package part_2.module_2;

import java.util.Arrays;

//Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
public class Task_12 {
    public static void main(String[] args) {
        int n = 5;
        int[][] a = new int[n][n];
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) ((Math.random()) * 10);
                System.out.print(a[i][j] + "    ");
            }
            System.out.println();
        }

        for (int[] i : a) {
            Arrays.sort(i);
        }
        System.out.println("Сортировка строк по возрастанию: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "    ");
            }
            System.out.println();
        }

        System.out.println("Сортировка строк по убыванию: ");
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                System.out.print(a[i][j] + "    ");
            }
            System.out.println();
        }
    }
}


