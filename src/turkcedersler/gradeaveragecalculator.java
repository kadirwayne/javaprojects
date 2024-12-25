package turkcedersler;
import java.util.Scanner;

public class gradeaveragecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("vize notunu giriniz");
        double vize = sc.nextDouble();
        System.out.println("final notunu giriniz");
        double finaller = sc.nextDouble();
        System.out.println("quiz notunu giriniz");
        double quiz = sc.nextDouble();

        double gradeaverage = (vize + finaller + quiz)/3;
        System.out.println("ortalamaniz: "+ gradeaverage);
        String sonuc = (gradeaverage >= 50) ? "gectiniz" : "kaldiniz";
        System.out.println(sonuc);
    }
}
