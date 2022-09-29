package part_2.module_2;

//Сформировать квадратную матрицу порядка N по правилу:
//A[I,J]=sin((I^2-J^2)/N)
//и подсчитать количество положительных элементов в ней.
public class Task_7 {
    public static void main(String[] args) {
        int n = 5;
        int kol = 0;
        double[][] a = new double[n][n];
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = Math.sin((i * i - j * j) / n);
                System.out.printf("%.4f  ", a[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] > 0) {
                    kol += 1;
                }
            }
        }
        System.out.println("Количество положительных элементов: ");
        System.out.println(kol);

    }
}