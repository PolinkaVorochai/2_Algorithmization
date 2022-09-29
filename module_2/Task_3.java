package part_2.module_2;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
public class Task_3 {
    public static void main(String[] args) {
        int s = 5;//строки
        int c = 10;//столбцы
        int[][] a = new int[s][c];
        System.out.println("Исходный массив: ");
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = i + j * 2;
                System.out.print(a[i][j] + "    ");
            }
            System.out.println();
        }


        int k = 40;  //unput nymber of string
        int p = 30;      //введите номер столбца

        System.out.println("Вывод строки под номнером " + k + ":");
        if (k < s) {
            for (int i = 0; i < c; i++) {
                System.out.print(a[k][i] + "   ");
            }
        } else {
            System.out.println("k должно быть меньше " + s);
        }

        System.out.println();
        System.out.println("Вывод столбца под номнером " + p + ":");

        if (p < c) {
            for (int i = 0; i < s; i++) {
                System.out.print(a[i][p] + "   ");
            }
        } else {
            System.out.println("p должно быть меньше " + c);
        }
    }
}

