package if_else;
import java.util.Scanner;
public class divisiblityby5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a positive integer greater then 5: ");
        int n = sc.nextInt();
        if (n<0) n=-n;
        if(n<5) System.out.println("invalid input ");
        else if (n%5==0) {
            System.out.println("the number is divisible by 5");
        }
        else System.out.println("not divisible by 5");

    }
}
