package turkcedersler;

public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 5;
        int d = 50;

        boolean kosul = a<b;
        boolean kosul2 = d<c;
        boolean result = kosul && kosul2; // ve
        boolean result2 = kosul || kosul2; // veya

        System.out.println(result);
        System.out.println(result2);
    }
}
