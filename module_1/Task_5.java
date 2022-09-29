package part_2.module_1;

import java.util.Arrays;

//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
public class Task_5 {
    public static void main(String[] args) {
        int n = 12;
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = (int) (Math.random() * 12);
            if (A[i] > i) {
                System.out.print(A[i] + " ");
            } else continue;
        }
        System.out.println();
        System.out.println(Arrays.toString(A));

    }
}
