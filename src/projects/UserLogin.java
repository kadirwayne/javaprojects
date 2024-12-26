package projects;
import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username, password;
        System.out.print("set your username: ");
        username = scan.nextLine();
        System.out.print("set your password: ");
        password = scan.nextLine();
int attempts = 3;
boolean loggedin = false;

while (attempts > 0) {
    String settedusername, settedpassword;
    System.out.print("Enter your username: ");
    settedusername = scan.nextLine();
    System.out.print("Enter your password: ");
    settedpassword = scan.nextLine();

    if (username.equals(settedusername) && password.equals(settedpassword)) {
        System.out.println("you're logged in");
        loggedin = true;
        break;
    }else{
        attempts--;
        if (attempts > 0) {
            System.out.println("wrong username or password " + attempts + " attempts left");
        }else {
            System.out.println("wrong username or password. no attempts left. access denied");
        }
    }

}
if (!loggedin) {
    System.out.println("please try again later");
}
scan.close();


}}
