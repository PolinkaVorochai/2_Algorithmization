package part_2.module_1;

//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами.
public class Task_6 {
    public static void main(String[] args) {
        int n = 13;
        double sum = 0;
        double[] a = new double[n];

        for (int i = 0; i < n; i++) {
            a[i] = Math.random() * 3;

            for (int j = 2; j < n; j++) {
                if (j < i && i % j == 0) {
                    break;
                } else if (j > i) {
                    break;
                } else if (i == 0 || i == 1) {
                    break;
                } else if (i == j)
                    sum += a[i];
            }
            System.out.printf("%.2f   ", a[i]);
        }
        System.out.println();
        System.out.printf("%.2f ", sum);
    }
}





