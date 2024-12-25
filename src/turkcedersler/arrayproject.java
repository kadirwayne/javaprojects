package turkcedersler;

import java.util.Scanner;

public class arrayproject {
    public static void main(String[] args) {
        int[] notlar = new int[4];

        int toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.println("hg, notlarini sirayla gir: ");
        System.out.println("mat1: ");
        notlar[0] = input.nextInt();
        System.out.println("turkce: ");
        notlar[1] = input.nextInt();
        System.out.println("fizik ");
        notlar[2] = input.nextInt();
        System.out.println("kimya: ");
        notlar[3] = input.nextInt();

        for(int not : notlar){
            toplam += not;
        }
        System.out.println("ortalamaniz: " + (toplam/notlar.length));



    }
}
