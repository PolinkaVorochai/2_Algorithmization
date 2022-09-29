package part_2.module_4.Task_9;

/*
Даны числа X, Y, Z, Т — длины сторон четырехугольника.
Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.
 */
/*
Комментарий к представленному решению:
четырехугольник разбивают на 2 треугольника: 1 прямоугольный со сторонами X, Y, второй - произвольный.
Площадь второго треугольника находится по формуле Герона, а его третья сторона - по теореме Пифагора.
Площадь четырехугольника равна сумме площадей двух треугольников.
 */
public class Task_9 {
    private double sideX;
    private double sideY;
    private double sideZ;
    private double sideT;

    public static void main(String[] args) {
        Task_9 task9 = new Task_9();
        task9.setSideX(3);
        task9.setSideY(10);
        task9.setSideT(8);
        task9.setSideZ(6);
        task9.resultSquare();
    }

    public void setSideX(double sideX) {
        if (sideX > 0) {
            this.sideX = sideX;
        } else {
            System.out.println("Длина стороны должна быть положительной");
        }
    }

    //проверка на существование 1 треугольника
    private boolean examTriangle1() {
        boolean exam = false;
        if (sideW() < sideX + sideY && sideX < sideW() + sideY && sideY < sideW() + sideX) {
            exam = true;
        }
        return exam;
    }

    //проверка на существование 2 треугольника
    private boolean examTriangle2() {
        boolean exam = false;
        if (sideW() < sideT + sideZ && sideT < sideW() + sideZ && sideZ < sideW() + sideT) {
            exam = true;
        }
        return exam;
    }

    public void setSideY(double sideY) {
        if (sideY > 0) {
            this.sideY = sideY;
        } else {
            System.out.println("Длина стороны должна быть положительной");
        }
    }

    public void setSideZ(double sideZ) {
        if (sideZ > 0) {
            this.sideZ = sideZ;
        } else {
            System.out.println("Длина стороны должна быть положительной");
        }
    }

    public void setSideT(double sideT) {
        if (sideT > 0) {
            this.sideT = sideT;
        } else {
            System.out.println("Длина стороны должна быть положительной");
        }
    }

    private double sideW() {
        double sideW = Math.sqrt(Math.pow(sideX, 2) + Math.pow(sideY, 2));
        return sideW;
    }

    private double square1() {
        double square = sideX * sideY / 2;
        return square;
    }

    private double square2() {
        double p = (sideZ + sideT + sideW()) / 2;//полупериметр
        double square = Math.sqrt(p * (p - sideT) * (p - sideZ) * (p - sideW()));
        return square;
    }

    public void resultSquare() {
        if (examTriangle1() && examTriangle2()) {
            double result = square1() + square2();
            System.out.println("Стороны четырехугольника: " + sideX + ", " + sideY + ", " + sideT + ", " + sideZ);
            System.out.println("Площадь: " + result);
        } else {
            System.out.println("Четырехугольник с заданными сторонами не существует");
        }
    }
}
