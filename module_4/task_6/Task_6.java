package part_2.module_4.task_6;

/*
Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */
class Task_6 {
    int a;//первое натуральное число
    int b;//второе натуральное число
    int c;//третье натуральное число

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

    //НОД
    private int gcd() {
        int gcd = 1;
        for (int i = 1; i <= a && i <= b && i <= c; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    //проверка взаимно простые числа
    public void simpleNumbers() {
        int gsd = gcd();
        if (gsd == 1) {
            System.out.println("numbers " + a + ", " + b + ", " + c + " are relatively prime numbers");
        } else {
            System.out.println("numbers " + a + ", " + b + ", " + c + " are not relatively prime numbers");
        }
    }
}
