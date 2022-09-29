package part_2.module_1;

//Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
// числом. Подсчитать количество замен.
public class Task_2 {
    public static void main(String[] args) {

        int n = 15;
        double[] A = new double[n];
        int z = 5;
        int number = 0;

        for (int i = 0; i < n; i++) {
            A[i] = Math.random() * 51 - 25;
            if (A[i] > z) {
                A[i] = z;
                number += 1;
            }

            System.out.printf("%.4f  ", A[i]);

        }
        System.out.println();
        System.out.println("Количество замен: " + number);

    }
}



