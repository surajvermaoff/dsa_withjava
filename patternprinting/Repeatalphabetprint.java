package patternprinting;

import java.util.Scanner;

public class Repeatalphabetprint {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of alphabets:-");
        int n = sc.nextInt();
        if (n >0 && n<=26) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print((char) (i + 64) + " ");

                }
                System.out.println();

            }


        }
        else System.out.println("invalid input");
    }
}
