package patternprinting;

import java.util.Scanner;

public class flippedalphabettriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number :- ");
        int n =sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j<=n+1-i ; j++) {
                System.out.print((char)(64+j)+" ");

            }
            System.out.println();

        }
    }
}
