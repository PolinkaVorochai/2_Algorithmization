package part_2.module_2;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
public class Task_5 {
    public static void main(String[] args) {
        int n = 8;
        int k = 1;
        int p = 0;

        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - i) {
                    a[i][j] = k;
                    System.out.print(a[i][j] + "   ");
                } else if (j >= n - i) {
                    a[i][j] = p;
                    System.out.print(a[i][j] + "   ");
                }
            }
            k += 1;
            System.out.println();
        }
    }
}




