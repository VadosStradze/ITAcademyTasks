package by.htp.les03.main;


import java.util.Scanner;

public class EleventhTask {
    public static void k() {
        Scanner scanner = new Scanner(System.in);
        //11
        double x;
        double y=0;
        double a=-2;
        double b=2;
        double h=0.1;
        for (x=a;x<=2;x=x+h){
            if (x>2){
                y=x;
            }else {
                y=-x;
            }
            System.out.println("Y= "+y+" X= "+x);
        }

        //
    }
}
