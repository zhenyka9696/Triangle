import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Triangle {
    public static void main(String[] args) {
        double a=0;
        double p=0;
        double s=0;
        Scanner scanner= new Scanner(System.in);
        System.out.print("a=");
        a=scanner.nextDouble();
        System.out.println(a);
        p=3*a;
        System.out.print("p=");
        System.out.println(p);
        s=(int(a)^2)*sqrt(int(3))/4;
        System.out.println(s);
    }
}
