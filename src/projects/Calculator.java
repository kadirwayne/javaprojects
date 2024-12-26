package projects;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter first number: ");
        num1 = scan.nextInt();
        System.out.println("\n Enter second number: ");
        num2 = scan.nextInt();
        System.out.println("\n please choose the function: ");
        System.out.println("1- sum\n 2-deduct \n 3-multiply \n 4- divide \n 5- remainder");
        System.out.println("your choice: ");
        int choice = scan.nextInt();

        if (choice == 1){
            System.out.println("summarized:" + (num1 + num2));
        }else if (choice == 2){
            System.out.println("deducted:" + (num1 - num2));
        }else if (choice == 3){
            System.out.println("multiplied:" + (num1 * num2));
        }else if (choice == 4){
            if (num2 == 0){
                System.out.println("cannot be divided by zero");
            }else{
            System.out.println("divided:" + (num1 / num2));}
        }
        else if (choice == 5){
            System.out.println("remainder:" + (num1 % num2));
        }
        else{
            System.out.println("Invalid choice");
        }




    }

}
