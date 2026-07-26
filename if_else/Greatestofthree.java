package if_else;

import java.util.Scanner;

public class Greatestofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number ");
        int x = sc.nextInt();
        System.out.print("enter second number ");
        int y = sc.nextInt();
        System.out.print("enter 3rd number ");
        int z = sc.nextInt();
        if (x >= y && x >= z) {
            System.out.println("x is greatest");
        } else if (y >= z && y >= x) {
            System.out.println("y is greatest");
        }
        else {
            System.out.println("z is greatest");


        }
    }
}
