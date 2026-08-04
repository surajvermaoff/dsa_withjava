package arrays;

import java.util.Scanner;

public class sumofelementsofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size:-");
        int n = sc.nextInt();
        int sum=0;
        int product=1;
        int[] arr = new int[n];
        System.out.print("enter array elements:-");
        for (int i = 0; i <n ; i++) {
             arr[i] = sc.nextInt();
             sum+=arr[i];
             product*=arr[i];
        }
        System.out.println("sum of the elements of array is:-"+sum);
        System.out.println("product of the elements of array is:-"+product);

    }

}
