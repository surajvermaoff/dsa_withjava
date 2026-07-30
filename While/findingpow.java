package While;

import java.util.Scanner;

public class findingpow {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number: ");
    int x =sc.nextInt();
        System.out.print("enter power ");
        int n =sc.nextInt();
        int y=1;
        for (int i = 1; i <=n ; i++) {
             y*=x;
        }
        System.out.println(y);
    }
}
