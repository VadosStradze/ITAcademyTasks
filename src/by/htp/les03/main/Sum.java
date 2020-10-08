package by.htp.les03.main;
import java.util.Scanner;
public class Sum {
    public static void sum() {

        Scanner scanner = new Scanner(System.in);


        //1:
        double a=0;
        double b=0;
        double c=0;
        double res = 0;

        System.out.print("Введите a:"+'\n'+ ">: ");
        if (scanner.hasNextDouble()){
             a = scanner.nextDouble();
        }
        System.out.print("Введите b:"+'\n'+ ">: ");
        if (scanner.hasNextDouble()){
            b = scanner.nextDouble();
        }
        System.out.print("Введите c:"+'\n'+ ">: ");
        if (scanner.hasNextDouble()){
            c = scanner.nextDouble();
        }
        double fraction;
        fraction = (b + Math.sqrt(Math.pow(b,2)+4 * a * c)) / 2 * a;
        if(fraction!=0){
            res = fraction - Math.pow(a,3) * c +Math.pow(b,-2);
            System.out.println("Result:"+ res);
        }else{
            System.out.println("Знаменатель равен 0:");
        }


    }
}
