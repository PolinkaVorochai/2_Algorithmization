package part_2.module_2;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
public class Task_6 {
    public static void main(String[] args) {
        int n = 6;
        int k = 1;
        int p = 0;

        int[][] a = new int[n][n];
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                if (j < i || j >= n - i) {
                    a[i][j] = p;
                    System.out.print(a[i][j] + "   ");
                } else if (j > i || j < n - i) {
                    a[i][j] = k;
                    System.out.print(a[i][j] + "   ");
                }
            }
            System.out.println();
        }

        for (int i = n / 2; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - 1 - i || j > n - (n - i)) {
                    a[i][j] = p;
                    System.out.print(a[i][j] + "   ");
                } else if (j >= n - i || j <= n - (n - i)) {
                    a[i][j] = k;
                    System.out.print(a[i][j] + "   ");
                }
            }
            System.out.println();
        }
    }
}
