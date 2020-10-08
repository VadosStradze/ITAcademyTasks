package by.htp.les03.main;
import java.util.Scanner;
import static java.lang.Math.pow;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Sum.sum();


        /*//2:
        double a;
        double b;
        double c;
        double d;
        double res;

        System.out.println("Введите а:");
        System.out.print(">: ");
        while (!scanner.hasNextDouble()){
            scanner.next();
            System.out.print(">: ");
        }
        a = scanner.nextDouble();
        System.out.println("Введите b:");
        System.out.print(">: ");
        while (!scanner.hasNextDouble()){
            scanner.next();
            System.out.print(">: ");
        }
        b = scanner.nextDouble();
        System.out.println("Введите c:");
        System.out.print(">: ");
        while (!scanner.hasNextDouble()){
            scanner.next();
            System.out.print(">: ");
        }
        c = scanner.nextDouble();
        System.out.println("Введите d:");
        System.out.print(">: ");
        while (!scanner.hasNextDouble()){
            scanner.next();
            System.out.print(">: ");
        }
        d = scanner.nextDouble();

        res = a/c * b/d - (a*b - c) / (c*d);
        if (res != 0){
            System.out.println("Result: "+res);
        }else {
            System.out.println("Знаменатель = 0: ");
        }*/


        /*//3
        Double number;
        System.out.println("Перевод в единицы информации: ");
        System.out.print("Введите число в байтах (byte):"+ '\n'+ ">: ");
        while (!scanner.hasNextDouble()){
            scanner.next();
            System.out.print("Что-то не так, попробуйте еще раз :" +  '\n'+">: ");
        }
        number = scanner.nextDouble();
        System.out.println(number + " Байт соответствует: ");
        System.out.println(number * 8 +" Бит");
        System.out.println(number / pow(2,10)+" Кбайт");
        System.out.printf("Мбайт "+"%.3f",number/pow(2,20));
        */


        /*//4
        double firstNumber = 0;
        double secondNumber = 0;
        System.out.println("Введите 1-ое число:");
        if(scanner.hasNextDouble()){
            firstNumber =scanner.nextDouble();
        }
        System.out.println("Введите 2-ое число:");
        if (scanner.hasNextDouble()){
            secondNumber = scanner.nextDouble();
        }
        if (firstNumber > secondNumber){
            System.out.println("8");
        }else if (firstNumber< secondNumber){
            System.out.println("7");
        }else if (firstNumber == secondNumber){
            System.out.println("7 и 8 ");
        }*/


        /*//5
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
        }*/


        /*//6
        int angle_1 = 0;
        int angle_2 = 0;
        int angle_3 = 0;

        System.out.println("Введите 1 угол: ");
        if (scanner.hasNextInt()){
            angle_1 = scanner.nextInt();
        }
        System.out.println("Введите 2 угол: ");
        if (scanner.hasNextInt()){
            angle_2 = scanner.nextInt();
        }
        System.out.println("Введите 3 угол: ");
        if (scanner.hasNextInt()){
            angle_3 = scanner.nextInt();
        }

        int angleSum = angle_1+angle_2 + angle_3 ;

        if (angleSum==180) {
            System.out.println("Такой треугольник существует! ");
            if (angle_1 == 90 | angle_2 == 90 | angle_3 == 90) {
                System.out.println("Это прямоугольный треугольник ");
            }
        }else {
            System.out.println("Такого треугольника нет!");
        }*/


        /*//7
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
        */


        /*//8
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
        }*/


        /*//9
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
        System.out.println("F(x)= " + Fx);*/


        /*//10
        int i=0;
        while (i < 100){
            i += 2;
            System.out.println(i);
        }*/


        //11

    }
}
