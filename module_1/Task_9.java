package part_2.module_1;

import java.util.Arrays;

//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//чисел несколько, то определить наименьшее из них.
public class Task_9 {
    public static void main(String[] args) {
        int[] a = {0, -8, 4, 44, 4, -5, 7819, -781, 4, 0, -8, -8, -74, 0, -1, 7819};
        int p = 0;
        int[] povtor = new int[a.length];
        int kolMax = 0;
        int chastota = povtor[0];

        for (int i = 0; i < a.length; i++) {//поиск повторов
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    p += 1;
                }
                povtor[i] = p;
            }
            p = 0;
        }
        System.out.println("Заданный массив чисел: ");
        System.out.println(Arrays.toString(a));
        System.out.println("Массив частоты повторов чисел: ");
        System.out.println(Arrays.toString(povtor));

        for (int i = 0; i < povtor.length; i++) {//поиск максимального повтора
            if (chastota <= povtor[i]) {
                chastota = povtor[i];
            }
        }

        System.out.println("Максимальный повтор: " + chastota);

        for (int i = 0; i < povtor.length; i++) {
            if (chastota == povtor[i]) {
                kolMax += 1;
            }
        }

        int[] index = new int[kolMax];
        int k = 0; //переменная, которая хранит индекс массива

        for (int i = 0; i < povtor.length; i++) {
            if (povtor[i] == chastota) {
                index[k] = i;
                k++;
            }
        }

        int[] res = new int[kolMax];
        int r = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < index.length; j++) {
                if (index[j] == i) {
                    res[r] = a[i];
                    r++;
                }
            }
        }


        int mi = res[0];

        for (int i = 0; i < res.length; i++) {
            if (mi >= res[i]) {
                mi = res[i];
            }
        }


        System.out.println("Количество индексов максимальных повторов: " + kolMax);
        System.out.println("Массив индексов тех элементов, которые повторяются наиболее часто одинаковое количество раз:");
        System.out.println(Arrays.toString(index));
        System.out.println("Массив чисел максимально повторяющихся:");
        System.out.println(Arrays.toString(res));
        System.out.println("Минимальное число из наиболее часто встречающихся чисел: " + mi);


    }
}





