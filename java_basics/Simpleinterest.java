package java_basics;
import java.util.Scanner;
public class Simpleinterest {
    public static void main(String[] args) {
        Scanner nitish = new Scanner(System.in);
        System.out.print("enter principle amount : ");
        int p = nitish.nextInt();
        System.out.print("enter rate : ");
        int r = nitish.nextInt();
        System.out.print("enter time period : ");
        int t = nitish.nextInt();
        int totalInterest = (p*r*t)/100;
        System.out.println("total interest to be paid :-"+totalInterest);
    }
}

