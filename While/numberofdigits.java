package While;

import java.util.Scanner;

public class numberofdigits {
    public static void main(String[] args) {
        int count =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int n =sc.nextInt();
        if(n==0) n=1;
        while(n != 0){
            n /=10;
            count++;
        }
        System.out.println(count);

    }
}