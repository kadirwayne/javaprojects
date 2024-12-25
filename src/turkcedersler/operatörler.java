package turkcedersler;

public class operatörler {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int toplam = a + b;
        int cikarma = a - b;
        int carpma = a * b;
        int bolme = a / b;
        int mod = a % b;
        System.out.println("toplam: "+toplam);
        System.out.println("cikarma: "+cikarma);
        System.out.println("carpma: "+carpma);
        System.out.println("bolme: "+bolme);
        System.out.println("mod: "+mod);

        toplam++;
        cikarma--;
        System.out.println(toplam); //cevap 16
        System.out.println(cikarma); //cevap 4
        int sonuc = ++a + --b; //cevap 15 yine
        System.out.println(sonuc);

        //kosul
        int sayi1=10;
        int sayi2=20;

        boolean kosul = (sayi1 == sayi2);
        boolean kosul2 = (sayi1 < sayi2);
        boolean kosul3 = (sayi1 / sayi2) == 5;
        System.out.println(kosul);
        System.out.println(kosul2);
        System.out.println(kosul3);

        boolean sonuc2 = (kosul && kosul3);
        System.out.println(sonuc2);

        sonuc2 = kosul || kosul2;
        System.out.println(sonuc2);


        String sonuc3 = (a==b) ? "dogru" : "yanlis";
        System.out.println(sonuc3);

        //ISIME YARAYACAK SHORTCUT
        int c = 5;
        c = c + 2;
        System.out.println(c);
        //bunun yerine böyle de yazabilirsin:
        c=5;
        c+=2;
        System.out.println(c);
        //yine cevap 7 olacak

    }
}
