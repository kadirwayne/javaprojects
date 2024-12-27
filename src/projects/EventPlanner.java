package projects;
import java.util.Scanner;

public class EventPlanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how's the weather? ");
        int weather = scan.nextInt();

        if (weather > -20 && weather < 50) {
            System.out.println("you said the weather is "+ weather +" degrees");
        if (weather >= 25) {
            System.out.println("so you can go for swimming! ");
        } else if (weather < 25 && weather >= 5) {
            System.out.println("so you can go to cinema! ");

        } else if (weather < 5) {
            System.out.println("so going for skiing would be a good idea! ");

        }
        }else{
            System.out.println("please enter a realistic tempreture");
        }

    }
    }

