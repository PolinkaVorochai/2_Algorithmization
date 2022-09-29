package part_2.module_2;

//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму.
public class Task_9 {
    public static void main(String[] args) {
        int n = 5;
        double[][] a = new double[n][n];
        double[] a1 = new double[n];
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = Math.random() * 20;
                System.out.printf("%.2f  ", a[i][j]);
            }
            System.out.println();
        }
        System.out.println("Сумма элементов по столбцам: ");
        double s = 0;
        for (int k = 0; k < n; ) {
            for (int i = 0; i < n; i++) {
                s += a[i][k];

            }
            a1[k] = s;
            System.out.printf("%.2f  ", a1[k]);
            s = 0;
            k++;
        }

        double ms = a1[0];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (ms <= a1[i]) {
                ms = a1[i];
                index = i;
            }
        }
        System.out.println();
        System.out.println("Максимальная сумма по столбцу: ");
        System.out.printf("%.2f  ", ms);
        System.out.println();
        System.out.println("Номер столбца с максимальной суммой: " + index);

    }
}
