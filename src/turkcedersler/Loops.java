package turkcedersler;

public class Loops {
    public static void main(String[] args) {
        //while(kosul){}

        System.out.println("while döngüsü: ");
        int a = 0;
        while (a < 5) {
            System.out.println(a);
            a++;
        }



        // do while
        System.out.println("\n do while döngüsü: ");

        int d = 0;
        do {
            System.out.println(d);
            d++;
        } while (d < 5);



        // for loop
        //for(baslangic; durum; arttirma){kodlar}

        System.out.println("\n for loop: ");

        for (int i = 0; i < 5; i++) {
            System.out.println(i);

            //for icine for yazabilirsin
            for (int j = 0; j < 5; j++) {
                System.out.println("i=" + i + ", j=" + j);
            }
        }



    }
}
