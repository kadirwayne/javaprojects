package turkcedersler;

import java.util.Scanner;

public class SwitchCse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sayi giriniz: ");
        int sayi = scan.nextInt();

        switch(sayi){
            case 1:
                System.out.println("sayi 1'e esittir");
                break;
            case 2:
                System.out.println("sayi 2'e esittir");
                break;
                case 3:
                    System.out.println("sayi 3'e esittir");
                    break;
                default:
                    System.out.println("gecersiz");

        }

    }
}
