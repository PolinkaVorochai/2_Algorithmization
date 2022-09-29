package part_2.module_1;

//Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.
public class Task_3 {
    public static void main(String[] args) {
        int n = 16;
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        int k = -3;
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = k;
            k++;
            System.out.print(A[i] + " ");
        }

//        for (int i = 0; i < n; i++) {
//            System.out.print(A[i] + " ");
//        }
        //       System.out.println("\n");
        System.out.println();

        for (int i = 0; i < n; i++) {
            if (A[i] == 0) {
                result1 += 1;
            } else if (A[i] > 0) {
                result2 += 1;
            } else {
                result3 += 1;
            }

        }
        System.out.println("Количество нулей: " + result1);
        System.out.println("Количество положительных чисел: " + result2);
        System.out.println("Количество отрицательных чисел: " + result3);

    }
}
