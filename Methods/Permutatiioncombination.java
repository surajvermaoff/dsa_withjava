package Methods;

import java.util.Scanner;

public class Permutatiioncombination {//take two inputs and find input ncr and pcr
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the total number :-");
        int n = sc.nextInt();
        System.out.print("enter the number of elements:-");
        int r = sc.nextInt();
        int ncr=fact(n)/(fact(r)*fact(n-r));
        int npr = fact(n)/(fact(n-r));
        System.out.println(ncr);
        System.out.println(npr);
    }
    public static int fact(int a){
        int f=1 ;
        for (int i = 1; i <=a ; i++) {
            f*=i;
        }
        return f;
    }
}
