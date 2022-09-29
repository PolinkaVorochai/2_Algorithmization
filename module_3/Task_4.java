package part_2.module_3;

//Сортировка обменами. Дана последовательность чисел  a1<=a2<=...<=an.Требуется переставить числа в
//порядке возрастания. Для этого сравниваются два соседних числа ai и a(i+1) . Если ai>a(i+1) , то делается
//перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
//Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
public class Task_4 {
    public static void main(String[] args) {
        int n = 15;
        int[] a = new int[n];
        boolean s = false;
        int t;
        int p = 0;
        System.out.println("Заданный массив: ");
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * 10 + 6);
            System.out.print(a[i] + "     ");
        }
        System.out.println();
        System.out.println("Массив после перестановки элементов: ");
        while (!s) {
            s = true;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    p += 1;
                    t = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = t;
                    s = false;

                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "       ");
        }
        System.out.println();
        System.out.println("Количество перестановок:  " + p);
    }
}
