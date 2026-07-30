package While;

import java.util.Scanner;

public class Printnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter numbers :");
                int n = sc.nextInt();
                int i = 1;
                while (i<=n)
                {
                    System.out.println(i);
                    i++;
                }
    }
}
