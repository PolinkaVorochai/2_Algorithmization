package part_2.module_2;

import java.util.Scanner;

//В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры.
public class Task_8 {
    public static void main(String[] args) {
        int n = 5;
        double[][] a = new double[n][n];
        double[][] a1 = new double[n][n];
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = Math.random() * 5 - 2;
                System.out.printf("%.2f  ", a[i][j]);
            }
            System.out.println();
        }
        System.out.println("Введите 2 целых числа от 0 до  " + (n - 1));
        Scanner k = new Scanner(System.in);
        int m = k.nextInt();
        int r = k.nextInt();

        if (m >= n || r >= n) {
            System.out.println("Вы ввели неверные данные");
        }


        System.out.println("Матрица после перемены мест столбцов " + m + ",  " + r);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == m) {
                    a1[i][j] = a[i][r];
                    System.out.printf("%.2f  ", a1[i][j]);
                } else if (j == r) {
                    a1[i][j] = a[i][m];
                    System.out.printf("%.2f  ", a1[i][j]);
                } else if (j != m || j != r) {
                    System.out.printf("%.2f  ", a[i][j]);
                }


            }
            System.out.println();
        }
    }
}
