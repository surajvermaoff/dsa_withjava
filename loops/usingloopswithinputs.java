package loops;

import java.util.Scanner;

public class usingloopswithinputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type how many times you want to print");
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("suraj");
        }
        System.out.println("numbner of times printed :"+n);
    }
}
