package part_2.module_2;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
public class Task_2 {
    public static void main(String[] args) {
        int[][] a = {
                {12, 14, 98, -78, 0},
                {178, 254, -8, -74, -9},
                {-145, -7, -9, 14, 13},
                {-7, 15, 96, 1458, -874},
                {58, 42, -89, 146, -987}};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == j) {
                    System.out.println(a[i][j]);
                }
            }
        }
    }
}
