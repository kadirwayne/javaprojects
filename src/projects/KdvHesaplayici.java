package projects;
import java.util.Scanner;

public class KdvHesaplayici {
    public static void main(String[] args){
        double tutar, kdvlifiyat, kdv = 0.18;

        Scanner input = new Scanner(System.in);
        System.out.println("ürünün tutarini giriniz: ");
        tutar = input.nextDouble();
        kdvlifiyat = tutar + (tutar*kdv);
        System.out.println("KDV'li tutar: " + kdvlifiyat);

    }
}
