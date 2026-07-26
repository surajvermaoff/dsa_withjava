package if_else;

import java.util.Scanner;

public class teranaryifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("eneter a positive integer:-");
        int a = sc.nextInt();
         String  c = (a%2==0) ? "even" : "odd ";
        System.out.println(c);
    }
}
