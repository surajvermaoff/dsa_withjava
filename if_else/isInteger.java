package if_else;
import java.util.Scanner;
public class isInteger {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number: ");
        double n = sc.nextDouble();
        int x = (int)n;
        if (n-x>0) System.out.println("not an integer");
        else System.out.println("it is a integer");
    }
}
