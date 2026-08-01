package patternprinting;

import java.util.Scanner;

public class xstar {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a odd number:- ");
        int n = sc.nextInt();
        if (n % 2 != 0) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if ((i == j) || (j==n+1-i)) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }

                }
                System.out.println();
            }

        }
        else System.out.println("input can't be even ");
    }
}
