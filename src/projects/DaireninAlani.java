package projects;
import java.util.Scanner;

class DaireninAlani {
    public static void main (String[] args) {
        // alan 2.pi.r
        //hacim pi.r^2

        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yaricapi nedir? (r): ");
        double r = input.nextDouble();

        double alan = 2*pi*r;
        double hacim = pi*(r*r);
        System.out.println("Alan: " + alan);
        System.out.println("Hacim: " + hacim);


    }
}
