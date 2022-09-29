package part_2.module_3;

//Сортировка выбором. Дана последовательность чисел a1<=a2<=...<=an .Требуется переставить элементы так,
//чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
//элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
//повторяется. Написать алгоритм сортировки выбором.
public class Task_3 {
    public static void main(String[] args) {
        int n = 20;
        int[] a = new int[n];
        int[] b = new int[n];
        System.out.println("Массив заданный:");
        for (int i = 0; i < a.length; i++) {
            a[i] += 12 * i;
            System.out.print(a[i] + "   ");
        }
        System.out.println();

        for (int i = 0, j = n - 1; i < n && j >= 0; i++, j--) {
            b[i] = a[j];
        }


        System.out.println("Ответ:");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + "   ");
        }
        System.out.println();
    }
}
