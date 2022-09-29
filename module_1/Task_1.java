package part_2.module_1;

public class Task_1 {
    public static void main(String[] args) {
//        В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
        int result = 0;
        int N = 50;
        int K = 3;
        int r = 1; //задается значение первого элемента массива
        int[] A = new int[N]; //резервирование памяти на массив из N элементов

        for (int i = 0; i < N; i++) {
            A[i] = r;
            r++; // заполнение массива из N элементов натуральными числами
            System.out.print(A[i] + " ");// вывести сам массив A
        }

        for (int i = 0; i < N; i++) {
            if (A[i] % K == 0) {
                result += A[i];
            } else continue;
        }

        System.out.println("\nСумма элементов массива кратных K: " + result);

    }
}
