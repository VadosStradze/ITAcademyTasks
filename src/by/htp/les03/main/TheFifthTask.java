package by.htp.les03.main;

import java.util.Scanner;

public class TheFifthTask {
    public static void e() {
        Scanner scanner = new Scanner(System.in);
        //5
        double b;
        double a;
        double i;
        double min;
        double max;

        for (i=0;i<3;i++) {
            System.out.print("Введите a:" + '\n' + ">: ");
            a = scanner.nextDouble();
            System.out.print("Введите b:" + '\n' + ">: ");
            b = scanner.nextDouble();
            if (a>b){
                min = b;
                max = a;
                System.out.println("Минимальное число: "+min +"  Максимальное число: "+ max);
            }else if (a<b){
                min = a;
                max = b;
                System.out.println("Минимальное число: "+min +"  Максимальное число: "+ max);
            }
        }

    }
}
