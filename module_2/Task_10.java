package part_2.module_2;

//Найти положительные элементы главной диагонали квадратной матрицы.
public class Task_10 {
    public static void main(String[] args) {
        int n = 5;
        int[][] a = new int[n][n];

        System.out.println("Исходная матрица: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = 11 + i * 5 + j * (-3);
                System.out.print(a[i][j] + "    ");
            }
            System.out.println();
        }

        System.out.println("Положительные элементы главной диагонали матрицы: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && a[i][j] > 0) {
                    System.out.print(a[i][j] + "   ");
                }
            }
        }
    }


}

