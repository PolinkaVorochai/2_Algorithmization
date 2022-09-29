package part_2.module_2;

import java.util.Scanner;

//Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
//..., 2 n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
//собой. Построить такой квадрат. Пример магического квадрата порядка 3:
//6 1 8
//7 5 3
//2 9 4
public class Task_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число кратное 4");
        int n = in.nextInt();
        int[][] a = new int[n][n];
        if (n % 4 > 0) {
            System.out.print("n должно быть кратно 4");
        } else {
            System.out.println("Исходный массив:  ");
            Task_16.GenerateArray(a);
            Task_16.PrintArray(a);
            System.out.println("Магический квалрат:  ");
            Task_16.ReverseArray1(a);
            Task_16.ReverseArray2(a);
            Task_16.PrintArray(a);
        }
    }

    public static void PrintArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void GenerateArray(int[][] a) {
        int k = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = k;
                k++;
            }
        }
    }


    public static void ReverseArray1(int[][] a) {
        int t;
        for (int i = 0; i < a.length / 2; i++) {
            for (int j = 0; j < a.length / 2; j++) {
                if (i == j) {
                    t = a[i][j];
                    a[i][j] = a[a.length - 1 - i][a.length - 1 - j];
                    a[a.length - 1 - i][a.length - 1 - j] = t;
                }
            }
        }
    }

    public static void ReverseArray2(int[][] a) {
        int t;
        for (int i = 0, j = a.length - 1 - i; i <= (a.length / 2) - 1; ++i, --j) {
            t = a[i][j];
            a[i][j] = a[j][i];
            a[j][i] = t;
        }
    }
}
