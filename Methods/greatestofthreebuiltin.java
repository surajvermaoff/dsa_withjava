package Methods;

import java.util.Scanner;

public class greatestofthreebuiltin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number ");
        int a = sc.nextInt();
        System.out.print("enter second number ");
        int  b= sc.nextInt();
        System.out.print("enter 3rd number ");
        int c = sc.nextInt();
        System.out.println("your greatest number is:-"+max(a,b,c));
    }

    public static int max(int x, int y, int z) {

        if (x >= y && x >= z) {
            return x;
        } else if (y >= z && y >= x) {
            return y;
        } else {
            return z;
        }
    }
}
