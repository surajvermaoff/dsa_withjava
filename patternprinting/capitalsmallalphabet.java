package patternprinting;

import java.util.Scanner;

public class capitalsmallalphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of alphabet:-");
        int n = sc.nextInt();
        if (n>0 && n<=26){
            for (int i = 1; i <=n ; i++) {
                for (int j = 1; j <=n ; j++) {
                    if (i%2==0){
                        System.out.print((char)(i+96)+" ");
                    }
                    else System.out.print( (char)(i+64)+" ");

                }
                System.out.println();
            }

        }
        else System.out.println("invalid input");
    }
}
