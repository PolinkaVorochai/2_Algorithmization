package part_2.module_2;

//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
public class Task_15 {
    public static void main(String[] args) {
        int n = 5;
        int[][] a = new int[n][n];
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) ((Math.random()) * 85);
                System.out.print(a[i][j] + "    ");
            }
            System.out.println();
        }
        System.out.println("Наибольший элемент матрицы: ");
        int m = a[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (m <= a[i][j]) {
                    m = a[i][j];
                }
            }
        }
        System.out.println(m);
        System.out.println("Ответ: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] % 2 != 0) {
                    a[i][j] = m;
                }
                System.out.print(a[i][j] + "    ");
            }
            System.out.println();
        }
    }
}
