package loops;

import java.util.Scanner;

public class Compositenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = sc.nextInt();
//       //not a optimized code
        boolean flag = true;
        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if (n%i==0){
                flag=false;
                break;
            }

        }
        if(n==1||n==0) System.out.println("neither a prime nor a composite");
        else if (flag==false) System.out.println("composite number");
        else{
            System.out.println("prime number");
        }
        {

        }
    }
}
