package projects;

import java.util.Scanner;

public class PlaneTicketCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km,yas,tip;
        System.out.println("enter distance: ");
        km = input.nextInt();
        System.out.println("enter age: ");
        yas = input.nextInt();
        System.out.println("Choose the trip type (1- only go, 2- go and back): ");
        tip = input.nextInt();

        if (km > 0 && yas > 0 && (tip == 1 || tip == 2)) {
            System.out.println("inputs are correct ! ");
        }else{
            System.out.println("inputs are wrong !");
        }
    }
}
