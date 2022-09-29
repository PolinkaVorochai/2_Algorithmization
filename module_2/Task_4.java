package part_2.module_2;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
public class Task_4 {
    public static void main(String[] args) {
        int n = 10;
        int p = 10;
        int k = 1;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    a[i][j] = k;
                    k++;
                } else if (i % 2 != 0) {
                    a[i][j] = p;
                    p--;
                }
                System.out.print(a[i][j] + "   ");
            }
            k = 1;
            p = 10;
            System.out.println();
        }
    }
}
