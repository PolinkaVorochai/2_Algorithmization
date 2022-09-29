package part_2.module_4.task_2;

/*
Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */
class Task_2 {
    int a;//первое натуральное число
    int b;//второе натуральное число
    int c;//третье натуральное число
    int d;//четвертое натуральное число

    //ввести первое число
    public void setA(int a) {
        if (a > 0) {
            this.a = a;
        } else {
            System.out.println("неверное число");
        }
    }

    //ввести второе число
    public void setB(int b) {
        if (b > 0) {
            this.b = b;
        } else {
            System.out.println("неверное число");
        }
    }

    //ввести третье число
    public void setC(int c) {
        if (c > 0) {
            this.c = c;
        } else {
            System.out.println("неверное число");
        }
    }

    //ввести четвертое число
    public void setD(int d) {
        if (d > 0) {
            this.d = d;
        } else {
            System.out.println("неверное число");
        }
    }

    //найти минимальное число из 4 заданных
    int findMin() {
        int min1 = Math.min(a, b);
        int min2 = Math.min(c, d);
        int resultMin = Math.min(min1, min2);
        return resultMin;
    }

    //НОД
    int gcd() {
        int gcd = 1;
        for (int i = 1; i <= findMin(); i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
