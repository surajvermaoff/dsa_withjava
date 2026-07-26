package if_else;

import java.util.Scanner;

public class Quadrantfinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the 1st point:");
        int x = sc.nextInt();
        System.out.print("enter the 2nd point:");
        int y = sc.nextInt();
        sc.close();
        if(x==0&&y==0){
            System.out.println("origin");
        }
        else if(x>=0&&y>=0){
            System.out.println("1st quadrant");
        }
        else if(x<=0&&y>=0){
            System.out.println("2nd quadrant");
        }
        else if(x<=0&&y<=0){
            System.out.println("3rd quadrant");
        }
        else {
            System.out.println("4th quadrant");
        }


    }
}
