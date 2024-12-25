package turkcedersler;

public class stringsinifi {
    public static void main(String[] args) {
        /*
        str.length() : Girilen karakterin sayis1n1 döndürür.
        strl.concat(str2) : String birlestirme
        str.indexof('K') : karakterin konumunu verir
        str.charAt(5): indexof metoduna benzer sekilde bu sefer de konumu verilen karakteri okur
indexof metoduna
        str.compareTo("Kodlama"): büyük/kücük fark duyarl olarak karsilastiric
        str.compareToIgnoreCase ("KODlama"): büyük kücük harf duyarl olmadan karslatirar
        str.contains("kod"): girilen deger string icinde geciyor mu diye kontrol eder.
        str.endsWith("a"): belirtilen karakter(ler) ile bitivorsa true degerini dondurur•
        str.replace("Kodlama", "Vakti"): string degistirme icin kullanil1r.
        str.toLowerCase() , str.toUpperCase();
         */

        /*
        char[] str = {'k','o','d'};
        String metin = new String(str);
        System.out.println(metin);

        String m = "kod";
        */

        String metin = "kodlama hello";
        String metin2 = "vakti";
        System.out.println(metin.length());
        System.out.println(metin+metin2);
        System.out.println(metin.concat(metin2));
        System.out.println(metin.indexOf('L'));
        System.out.println(metin.charAt(1));
        System.out.println(metin.compareTo(metin2));
        System.out.println(metin.contains("lama"));
        System.out.println(metin.endsWith("M"));
        System.out.println(metin.replace("hello", "zamani"));
    }
}
