package part_2.module_2;

import java.util.Arrays;

//Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
public class Task_13 {
    public static void main(String[] args) {
        int n = 5;
        int[][] a = new int[n][n];
        int[][] a1 = new int[n][n];
        int[][] a2 = new int[n][n];
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) ((Math.random()) * 45);
                System.out.print(a[i][j] + "    ");
            }
            System.out.println();
        }
        //System.out.println("Транспонированная матрица: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a1[i][j] = a[j][i];
                // System.out.print(a1[i][j] + "    ");
            }
            // System.out.println();
        }

        for (int[] i : a1) {
            Arrays.sort(i);
        }
        System.out.println("Сортировка столбцов по возрастанию: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a1[j][i] + "    ");
            }
            System.out.println();
        }

        System.out.println("Сортировка столбцов по убыванию: ");
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                System.out.print(a1[j][i] + "    ");
            }
            System.out.println();
        }
    }
}
