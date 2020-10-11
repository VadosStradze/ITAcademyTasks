package by.htp.les03.main;


import java.util.Scanner;

public class ThirteenthTask {
    public static void m() {
        Scanner scanner = new Scanner(System.in);
        //13
        double n =0;
        int i;
        double sum=0;
        System.out.print("Введите ваше число:"+'\n'+">: ");
        while (!scanner.hasNextDouble()){
            scanner.next();
            System.out.print("Не шути так! Введи число:"+ '\n'+ ">: ");
        }
        n = scanner.nextDouble();
        if (n>0){
            for (i=1;i<=n;i++){
                sum = i+sum;
            }
        }else {
            System.out.println("Только > 0 ");
        }
        System.out.println("Сумма чисел до "+n+ " = "+sum);
    }
}
