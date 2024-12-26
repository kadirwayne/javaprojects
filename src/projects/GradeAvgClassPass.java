package projects;

import java.util.Scanner;

public class GradeAvgClassPass {
    public static void main(String[] args) {
    int math, english, science, chemistry;
    double average=0;

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Math grade: ");
    math = sc.nextInt();
    System.out.print("Enter English grade: ");
    english = sc.nextInt();
    System.out.print("Enter Science grade: ");
    science = sc.nextInt();
    System.out.print("Enter Chemistry grade: ");
    chemistry = sc.nextInt();
    average = (math+english+science+chemistry)/4;
    System.out.println("The average grade is "+average);

    if (average >= 50){
        System.out.println("You passed!");
    }else if (average <= 49){
        System.out.println("You failed to pass! try again next year");
    }



}}
