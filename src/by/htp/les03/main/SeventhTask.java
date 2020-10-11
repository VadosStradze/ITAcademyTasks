package by.htp.les03.main;

import java.util.Scanner;

public class SeventhTask {
    public static void g() {
        Scanner scanner = new Scanner(System.in);
        //7
        int a = 0;
        int b = 0;
        int c = 0;
        int n = 0;
        System.out.println("Введите число a: ");
        if (scanner.hasNextInt()){
            a = scanner.nextInt();
            if( a<0){
                n++;
            }
        }
        System.out.println("Введите число b: ");
        if (scanner.hasNextInt()){
            b = scanner.nextInt();
            if( b<0){
                n++;
            }
        }
        System.out.println("Введите число c: ");
        if (scanner.hasNextInt()){
            c = scanner.nextInt();
            if( c<0){
                n++;
            }
        }
        System.out.println("Содержит "+n+ " отрицательных чисел");

    }
}
