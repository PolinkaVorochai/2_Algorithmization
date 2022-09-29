package part_2.module_2;

//Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//которых число 5 встречается три и более раз.
public class Task_11 {
    public static void main(String[] args) {
        int[][] a = new int[10][20];
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                a[i][j] = (int) ((Math.random()) * 15);
                System.out.print(a[i][j] + "    ");
            }
            System.out.println();
        }
        System.out.println("Матрица повторов числа 5 по каждой строке: ");
        int[] p = new int[10];
        int r = 0;
        for (int i = 0; i < 10; ) {
            for (int j = 0; j < 20; j++) {
                if (a[i][j] == 5) {
                    r += 1;
                }
                p[i] = r;
            }
            System.out.print(p[i] + "   ");
            r = 0;
            i++;
        }
        System.out.println();
        System.out.println("Номера строк в которых число 5 встречается 3 и более раза: ");
        int index = 0;
        for (int i = 0; i < 10; ) {
            if (p[i] >= 3) {
                index = i;
                System.out.print(i + "   ");
            }
            index = 0;
            i++;
        }
    }
}
