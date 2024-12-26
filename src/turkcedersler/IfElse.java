package turkcedersler;

public class IfElse {
    public static void main(String[] args) {
        int a = 20;
        int b = 40;
        int c = 30;
        int d = 40;

        if (a == b){
            System.out.println(a + " is equal to " + b);
        }
        else if (a > b){
            System.out.println(a + " is greater than " + b);
        }
        else if (d != b){
            System.out.println(d + " is not equal to " + b);
        }
        else if (d < b){
            System.out.println(d + " is less than " + b);
        }
        else {
            System.out.println("it doesnt matter, just check the codes");
        }


    }
}
