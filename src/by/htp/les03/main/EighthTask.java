package by.htp.les03.main;

import java.util.Scanner;

public class EighthTask {
    public static void h() {
        Scanner scanner = new Scanner(System.in);
        //8
        double a = 0;
        double b = 0;
        double z = 0;
        double x = 0;
        double y = 0;

        System.out.print("Введите a:"+'\n'+ ">: ");
        if (scanner.hasNextDouble()){
            a = scanner.nextDouble();
        }
        System.out.print("Введите b:"+'\n'+ ">: ");
        if (scanner.hasNextDouble()){
            b = scanner.nextDouble();
        }
        System.out.print("Введите y:"+'\n'+ ">: ");
        if (scanner.hasNextDouble()){
            y = scanner.nextDouble();
        }
        System.out.print("Введите z:"+'\n'+ ">: ");
        if (scanner.hasNextDouble()){
            z = scanner.nextDouble();
        }
        System.out.print("Введите x:"+'\n'+ ">: ");
        if (scanner.hasNextDouble()){
            x = scanner.nextDouble();
        }
        if ((a > x)&&(b > y )){
            System.out.println("Пройдет");
        } else if ((a > x)&&(b > z )){
            System.out.println("Пройдет");
        }else if ((a > z)&&(b > y )){
            System.out.println("Пройдет");
        }else if ((a > z)&&(b > x )){
            System.out.println("Пройдет");
        }else if ((a > y)&&(b > x )){
            System.out.println("Пройдет");
        }else if ((a > y)&&(b > z )){
            System.out.println("Пройдет");
        }else {
            System.out.println("Не пройдет");
        }

    }
}

