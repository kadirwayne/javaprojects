package turkcedersler;

import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;

        /*System.out.println("a sayisini giriniz: ");
        a = input.nextInt();
        System.out.println("b sayisini giriniz: ");
        b = input.nextInt();
        System.out.println("a sayisi:"+a);
        System.out.println("b sayisi:"+b);*/

        /*double c;
        System.out.println("double turunde sayi gir");
        c = input.nextDouble();
        System.out.println(c);*/

        String str;
        str = input.nextLine(); //satiri komple alir. örn: "merhaba kanka ben..."
        //input.next(); sadece kelimeyi alir. "merhaba"
        System.out.println(str);




    }
}
