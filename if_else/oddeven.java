package if_else;
import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number you want to check: ");
        int a= sc.nextInt();
        if(a%2==0){
            System.out.println("the number is even");
        }
         else{
            System.out.println("the number is odd");
        }
    }
}
