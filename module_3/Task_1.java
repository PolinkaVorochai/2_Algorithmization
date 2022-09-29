package part_2.module_3;

//Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
//дополнительный массив.
public class Task_1 {
    public static void main(String[] args) {
        int[] a = {12, -45, -41, 10, 9856, -74, -8523, 15};
        int[] b = {145, 78, 126, 201, -730};
        int k = 1;

        for (int i = 0; i < a.length; i++) {

            if (i <= k) {
                System.out.print(a[i] + "   ");
            }
            if (i == k + 1) {
                for (int j = 0; j < b.length; j++) {
                    System.out.print(b[j] + "   ");
                }
            }
            if (i > k) {
                System.out.print(a[i] + "   ");
            }
        }
    }
}


