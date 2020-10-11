package by.htp.les03.main;

import java.util.Scanner;

public class Fourth_Task {
    public static void d() {
        Scanner scanner = new Scanner(System.in);

        //4
        double firstNumber = 0;
        double secondNumber = 0;

        System.out.println("Введите 1-ое число:");
        if (scanner.hasNextDouble()) {
            firstNumber = scanner.nextDouble();
        }
        System.out.println("Введите 2-ое число:");
        if (scanner.hasNextDouble()) {
            secondNumber = scanner.nextDouble();
        }
        if (firstNumber > secondNumber) {
            System.out.println("8");
        } else if (firstNumber < secondNumber) {
            System.out.println("7");
        } else if (firstNumber == secondNumber) {
            System.out.println("7 и 8 ");
        }
    }
}