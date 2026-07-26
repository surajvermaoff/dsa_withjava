package if_else;
import java.util.Scanner;
public class Fourdigitnumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("enter a number ");
    int n =sc.nextInt();
    if(n>999 && n<10000) System.out.println(n+" is a four digit number");
    else System.out.println(n+" is not a four digit number");

    }
}
