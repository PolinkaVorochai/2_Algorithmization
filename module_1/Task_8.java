package part_2.module_1;

//Дана последовательность целых чисел n a ,a , ,a 1 2  . Образовать новую последовательность, выбросив из
//исходной те члены, которые равны min( , , , ) 1 2 n a a  a .
public class Task_8 {
    public static void main(String[] args) {
        int[] a = {-14, -1000, 0, 54, -14, -1500, 69, -15};//пусть максимальное число в последовательности не более 100
        int m;
        m = a[0];
        for (int i = 0; i < a.length; i++) {
            if (m >= a[i]) {
                m = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != m) {
                System.out.print(a[i] + " ");
            }
        }
    }
}






