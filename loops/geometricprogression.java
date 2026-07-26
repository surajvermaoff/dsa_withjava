package loops;

import java.util.Scanner;

public class geometricprogression {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1  ,d=2;
        for (int i = 0; i < n; i++) {
            System.out.print(a+" ");
            a*=d;

        }
    }
}
