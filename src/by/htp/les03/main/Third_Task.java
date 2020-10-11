package by.htp.les03.main;

import static java.lang.Math.pow;

import java.util.Scanner;

public class Third_Task {
    public static void c() {
        Scanner scanner = new Scanner(System.in);
        //3
        Double number;
        System.out.println("Перевод в единицы информации: ");
        System.out.print("Введите число в байтах (byte):" + '\n' + ">: ");
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.print("Что-то не так, попробуйте еще раз :" + '\n' + ">: ");
        }
        number = scanner.nextDouble();
        System.out.println(number + " Байт соответствует: ");
        System.out.println(number * 8 + " Бит");
        System.out.println(number / pow(2, 10) + " Кбайт");
        System.out.printf("Мбайт " + "%.3f", number / pow(2, 20));

    }
}
