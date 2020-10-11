package by.htp.les03.main;

import java.util.Scanner;

public class Second_Task {
    public static void b() {
        Scanner scanner = new Scanner(System.in);
        //2:
        double a;
        double b;
        double c;
        double d;
        double res;

        System.out.println("Введите а:");
        System.out.print(">: ");
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.print(">: ");
        }
        a = scanner.nextDouble();
        System.out.println("Введите b:");
        System.out.print(">: ");
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.print(">: ");
        }
        b = scanner.nextDouble();
        System.out.println("Введите c:");
        System.out.print(">: ");
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.print(">: ");
        }
        c = scanner.nextDouble();
        System.out.println("Введите d:");
        System.out.print(">: ");
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.print(">: ");
        }
        d = scanner.nextDouble();

        res = a / c * b / d - (a * b - c) / (c * d);
        if (res != 0) {
            System.out.println("Result: " + res);
        } else {
            System.out.println("Знаменатель = 0: ");
        }
    }
}
