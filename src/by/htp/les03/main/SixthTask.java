package by.htp.les03.main;

import java.util.Scanner;

public class SixthTask {
    public static void f() {
        Scanner scanner = new Scanner(System.in);
        //6
        int angle_1 = 0;
        int angle_2 = 0;
        int angle_3 = 0;

        System.out.println("Введите 1 угол: ");
        if (scanner.hasNextInt()) {
            angle_1 = scanner.nextInt();
        }
        System.out.println("Введите 2 угол: ");
        if (scanner.hasNextInt()) {
            angle_2 = scanner.nextInt();
        }
        System.out.println("Введите 3 угол: ");
        if (scanner.hasNextInt()) {
            angle_3 = scanner.nextInt();
        }

        int angleSum = angle_1 + angle_2 + angle_3;

        if (angleSum == 180) {
            System.out.println("Такой треугольник существует! ");
            if (angle_1 == 90 | angle_2 == 90 | angle_3 == 90) {
                System.out.println("Это прямоугольный треугольник ");
            }
        } else {
            System.out.println("Такого треугольника нет!");
        }
    }
}
