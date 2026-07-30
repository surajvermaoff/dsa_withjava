package While;

import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        int x=0;
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the number: ");
        int n =sc.nextInt();
        while(n!=0){
           x*=10;
           x+=n%10;
          n/=10;
        }
        System.out.println(x);
    }
}
