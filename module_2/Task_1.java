package part_2.module_2;

//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
public class Task_1 {
    public static void main(String[] args) {
        int s = 5;//строки
        int c = 10;//столбцы
        int a[][] = new int[s][c];

        System.out.println("Исходный массив: ");
        for (int i = 0; i < s; i++) {
            System.out.println();
            for (int j = 0; j < c; j++) {
                a[i][j] = -15 * i * j;
                System.out.print(a[i][j] + "    ");
            }
        }
        System.out.println();
        System.out.println("Нечетные столбцы, у которых первый элемент больше последнего: ");

        for (int i = 0; i < c; i++) {
            if (i % 2 != 0 && a[0][i] > a[s - 1][i]) {
                for (int j = 0; j < s; j++) {
                    System.out.print(a[j][i] + "     ");
                }
            }
            System.out.println();
        }

    }

}




