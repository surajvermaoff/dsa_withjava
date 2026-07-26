package if_else;

import java.util.Scanner;

public class divisiblitybyor {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("enter a number ");
       int n = sc.nextInt();
       if(n%5==0 && n%3==0) {
           System.out.println("divisible by both 5 and 3");
       } else if (n%5==0 ||n%3==0){
           System.out.println("divisible by either 5 or 3");
       } else {
           System.out.println("not divisible by any of them");
       }
    }
}
