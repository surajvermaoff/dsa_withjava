package if_else;

import java.util.Scanner;

public class Smallestnumber {
    static void main(String[] args) {
        Scanner yuvraj = new Scanner(System.in);
        System.out.println("enter first number ");
        int a = yuvraj.nextInt();
        System.out.println("enter 2nd number ");
        int b = yuvraj.nextInt();
        System.out.println("enter 3rd number ");
        int c = yuvraj.nextInt();
        if(a<b){
            if(a<c){
                System.out.println(a);
            }
            else {
                System.out.println(c);

            }
        }
        else {
            if(b<c){
                System.out.println(b);
            }
            else {
                System.out.println(c);
            }

        }
        }

}
