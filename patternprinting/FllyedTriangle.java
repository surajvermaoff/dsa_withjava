package patternprinting;

import java.util.Scanner;

public class FllyedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows:-");
        int n = sc.nextInt();
        int x=0;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                   x++;
                System.out.print(x+" ");

            }
            System.out.println();
        }

    }
}
