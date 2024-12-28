package turkcedersler;

import java.util.Scanner;

public class Continuebreak {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sayi;

        while (true) {
            System.out.println("Hello World");
            break;
        }

        while(true) {
            System.out.println("bir sayi giriniz: ");
            sayi = scn.nextInt();
            if (sayi == 0) {
                break;
            }
            System.out.println(sayi);
            System.out.println("dongu bitti");
        }

        for (int g=1; g<10; g++){
            if(g==4 || g==9){
                System.out.println("atladi ="+g);
                continue;
            }
            System.out.println("g ="+g);

        }


    }
}
