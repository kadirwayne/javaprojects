package projects;
import java.util.Scanner;

public class Whilepractices2 {
    public static void main(String[] args) {

        //PROJECT 1
        //FACTORIAL
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int f = scan.nextInt();
        int result = 1;

        while(f>0){
            result *=f;
            f--;
        }
        System.out.println("result is "+result);



        //PROJECT 2
        //HARMONIC NUMBERS

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter a harmonic number: ");
        double h = scan2.nextInt();
        double harmonic = 0.0;

        while(h>0){
            harmonic += (1/h);
            h--;

        }
        System.out.println("harmonic is "+harmonic);




        //Project 3
        //print a triagle out of stars

        Scanner scan3 = new Scanner(System.in);
        System.out.println("Enter number: ");
        int star = scan3.nextInt();
        int y = 1;
        while(y <= star){
            int k = 1;
            while(k<=y){
                System.out.print("*");
                k++;
            }
            System.out.println();
            y++;

        }







    }
}
