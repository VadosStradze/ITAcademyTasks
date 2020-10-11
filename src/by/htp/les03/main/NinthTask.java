package by.htp.les03.main;

import java.util.Scanner;

public class NinthTask {

    public static void i() {
        Scanner scanner = new Scanner(System.in);
        //9
        double x = 0;
        double Fx;
        System.out.print("Введите x: ");
        if (scanner.hasNextDouble())
            x = scanner.nextDouble();
        if (x >= 3) {
            Fx = -x * x + 3 * x + 9;
        } else {
            Fx = 1 / (Math.pow(x, 3) - 6);
        }
        System.out.println("F(x)= " + Fx);
    }
}
