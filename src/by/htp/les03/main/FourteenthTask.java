package by.htp.les03.main;

import java.util.Scanner;

public class FourteenthTask {
    public static void n() {
        Scanner scanner = new Scanner(System.in);
        //14
        double n;
        double i;
        double factorial=1;
        System.out.print("Введите число: "+'\n'+">: ");
        n = scanner.nextDouble();
        for (i =1;i<=n;i++){
            factorial = i * factorial;
        }
        System.out.println(factorial);
    }
}
