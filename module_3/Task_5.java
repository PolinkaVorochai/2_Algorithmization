package part_2.module_3;

import java.util.Arrays;

//Сортировка вставками. Дана последовательность чисел a1, a2, ..., an . Требуется переставить числа в порядке
//возрастания. Делается это следующим образом. Пусть a1, a2, ..., ai - упорядоченная последовательность, т. е.
//a1<=a2<=...<=an . Берется следующее число a(i+1)  и вставляется в последовательность так, чтобы новая
//последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
//не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
//с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
public class Task_5 {
    public static void main(String[] args) {
        int n = 25;
        int[] a = new int[n];
        System.out.println("Заданный массив: ");
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * 23);
            System.out.print(a[i] + "     ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            int c = a[i];
            int j = i - 1;
            while (j >= 0 && c < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = c;
        }
        int index = binarysearch(a, 3);
        System.out.println(Arrays.toString(a));
        System.out.println((a[index]));
    }

    public static int binarysearch(int[] arr, int elementtosearch) {
        int firstIndex = 0;
        int lasttIndex = arr.length - 1;
        while (firstIndex <= lasttIndex) {
            int middleIndex = (firstIndex + lasttIndex) / 2;
            if (arr[middleIndex] == elementtosearch) {
                return middleIndex;
            }
            if (arr[middleIndex] < elementtosearch) {
                firstIndex = middleIndex + 1;
            }
            if (arr[middleIndex] > elementtosearch) {
                lasttIndex = middleIndex - 1;
            }

        }
        return -1;
    }
}
