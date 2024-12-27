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

        double normalprice, agediscount, tipdiscount;

        if (km > 0 && yas > 0 && (tip == 1 || tip == 2)) {

            normalprice = km * 0.10;
            if(yas<12){
                agediscount = normalprice * 0.5;
            }else if(yas>12 && yas<24){
                agediscount = normalprice * 0.10;
            }else if(yas>64){
                agediscount = normalprice * 0.30;
            }else{
                agediscount = 0;
            }
            normalprice -= agediscount;

            if(tip == 2){
                tipdiscount = normalprice*0.20;
                normalprice = 2*(normalprice - tipdiscount);

            }
            System.out.println("bilet tutari: " + normalprice + "$");

        }else{
            System.out.println("inputs are wrong or missing !");
        }
    }
}
