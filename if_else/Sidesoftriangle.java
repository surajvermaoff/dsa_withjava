package if_else;

import java.util.Scanner;

public class Sidesoftriangle {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("enter sides of traingle ");
        int n = SC.nextInt();
        int x =SC.nextInt();
        int z = SC.nextInt();
        SC.close();
        if((n+x>z)&&(x+z>n)&&(z+n>x)) System.out.println("it is triangle");
        else System.out.println("it is not a triangle");
    }
}
