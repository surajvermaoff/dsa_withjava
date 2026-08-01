package patternprinting;

import java.util.Scanner;

public class Hollowreactangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows :-");
        int n = sc.nextInt();
        System.out.print("enter number of columns :-");
        int m = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m; j++) {
                if(i==1 ||i==n) {
                    System.out.print(" * ");
                }
                else if (j==1 || j==m){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }

    }
}
