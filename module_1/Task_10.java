package part_2.module_1;

//Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
public class Task_10 {
    public static void main(String[] args) {
        int[] a = {-1, -10, 0, 44, -84, -5, 69, -8, -159, 47, 123, 784};

        for (int i = 0; i < a.length; i++) {
            if (i % 2 != 0) {
                a[i] = 0;
            }
            System.out.print(a[i] + " ");
        }
    }
}
