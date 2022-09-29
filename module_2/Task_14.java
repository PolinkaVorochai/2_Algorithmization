package part_2.module_2;

//Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца.
public class Task_14 {
    public static void main(String[] args) {
        int n = 7;
        int k = 0;
        int[][] a = new int[n][n];
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= k; j++) {
                a[i][j] = (int) ((Math.random()));
                System.out.print(a[i][j] + "    ");
            }
            for (int j = k + 1; j < n && j > k; j++) {
                a[i][j] = (int) (1 + (Math.random()));
                System.out.print(a[i][j] + "    ");
            }
            k += 1;
            if (k > n - 1) {
                break;
            }
            System.out.println();
        }
    }
}

