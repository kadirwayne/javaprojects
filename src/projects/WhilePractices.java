package projects;

import java.util.Scanner;

public class WhilePractices {
    public static void main(String[] args) {
        //PROJECT 1:
        //print out all the binary digits from 1 to 20
        System.out.println("PROJECT 1");
        for(int i = 0; i<=20; i++){
            if(i%2==0){
                System.out.println(i);
            }

        }

        //PROJECT 2
        //a program that rejects negative input numbers and
        //summerizes odd numbers

        Scanner scn = new Scanner(System.in);

        int toplam=0;
        int input;

        while(true){
            System.out.println("Enter number");
            input = scn.nextInt();

            if(input<0){
                System.out.println("you've given a negative number");
                System.out.println("sum of the odd numbers: "+toplam);
                break;
            }
            else if(input%2==1){
                toplam+=input;
            }
        }

        //PROJECKT 3
        // print binary numbers until the given number
        Scanner scn2 = new Scanner(System.in);
        int input2;
        int y = 0;


        System.out.println("Enter number: ");
        input2 = scn2.nextInt();

        while(y <=input2){
            System.out.println(y);
            y = y + 2;



            }




















    }
}
