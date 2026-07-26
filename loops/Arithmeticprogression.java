package loops;

import java.util.Scanner;

public class Arithmeticprogression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
//
        int a = 3,d=4;
        for (int i = 0; i <n ; i++) {
            System.out.print(a+" ");
            a+=d;
        }
    }
}
