package brocodelectures;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class arrays {
    public static void main(String[] args) {
        firstway();
        secondway();
        forloop();
        twodarrays();
        twodarraysalternate();
        turkishvideo();
        cokboyutluarray();


    }
    public static void firstway() {
        //array = used to store multiple values in a single variable

        String[] cars = {"camaro", "courvette", "tesla"};

        //elements
        cars[0] = "mustang";
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
    }
    public static void secondway() {
        //additional way
        String[] cars = new String[3];
        cars[0] = "camaro1";
        cars[1] = "courvette1";
        cars[2] = "tesla1";
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
    }
    public static void forloop() {
        String[] cars = new String[3];
        cars[0] = "camaro2";
        cars[1] = "courvette2";
        cars[2] = "tesla2";

        for(int i=0; i<cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
    public static void twodarrays() {
        String[][] cars = new String[3][3];

        cars[0][0] = "camaro3";
        cars[0][1] = "courvette3";
        cars[0][2] = "tesla3";
        cars[1][0] = "camaro4";
        cars[1][1] = "courvette4";
        cars[1][2] = "tesla4";
        cars[2][0] = "camaro5";
        cars[2][1] = "courvette5";
        cars[2][2] = "tesla5";

        for (int i= 0; i<cars.length; i++) {
            System.out.println();
            for(int j=0 ; j<cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");
            }


        }


    }
    public static void twodarraysalternate() {
        String[][] cars =   {
                {"camaro", "courvette", "bmw"},
                {"mustang", "ranger", "audi"},
                {"ferrari", "lambo", "tesla"}
                            };
        for (int i= 0; i<cars.length; i++) {
            System.out.println();
            for(int j=0 ; j<cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");
            }

    }
    }
public static void turkishvideo() {
        //veritipi diziadi[] = new veritipi[elemansayisi];
        //veritipi[] diziadi = new veritipi[elemansayisi];
        //veritipi[] diziadi = {v1,v2,v3}

    int[] liste = new int[4];  //0 dan basliyor saymaya
    //   int liste = {1,2,3,4};
    liste[0] = 1;
    liste[1] = 2;
    liste[2] = 3;
    liste[3] = 4;

    //System.out.println(liste[3]);
    for(int i=0; i<liste.length; i++) {
        System.out.print(liste[i]+" ");
    }



    //listeye ekleme cikarma
    /*int[] liste2 = new int[4];
    Scanner scan  = new Scanner(System.in);
    for(int i=0; i<liste2.length; i++) {
        liste2[i] = scan.nextInt();
    }
    for(int i=0; i<liste2.length; i++) {
        System.out.print(liste2[i]+" ");
    }

    //manuel
    liste2[0] = 1;*/
}
public static void cokboyutluarray() {
        //int[][] = iki tane kolon sayisi = cift boyutlu
    int[][] tablo = new int[][]{
            {1,75,10}, {2,87,13}, {3,95,15},{4,103,18}, {5, 110, 19}
    };

    int [][] tablo2 = new int[5][3];
    tablo2[0][0] = 1;
    tablo2[0][1] = 75;
    tablo2[0][2] = 10;

    for(int i=0; i<tablo.length; i++) {
        for(int j=0; j<tablo[i].length; j++) {
            System.out.print(tablo[i][j]+" ");
        }
        System.out.println();
    }



}


}
