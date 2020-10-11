package by.htp.les03.main;

import java.util.Scanner;

public class TheFifteenthTask {
    public static void o(){
        Scanner scanner = new Scanner(System.in);
        //15
        double a;
        double b;
        double res;
        System.out.println("Введите 1-ое число");
        a = scanner.nextDouble();
        System.out.println("Введите 2-ое число");
        b = scanner.nextDouble();
        while (b !=0) {
            res = (a%b);
            a = b;
            b = res;
        }
        System.out.println("Нод 2-ух чисел = " +a);
    }
}
