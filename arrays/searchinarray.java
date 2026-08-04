package arrays;

import java.util.Scanner;

public class searchinarray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        Scanner sc=new Scanner(System.in);
        System.out.print("enter target value:-");
        int target = sc.nextInt();
        int flag = -1;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==target){
                flag=i;
                break;
            }
        }
        if(flag==-1){
            System.out.println("target does not exist");
        }
        else System.out.println("the target exists at index:-"+flag);

    }
}