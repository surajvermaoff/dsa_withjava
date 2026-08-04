package arrays;

import java.util.Scanner;

public class multiplyadd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size :- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter array elements :-");
        for (int i = 0; i <n ; i++) {
            arr[i]= sc.nextInt();
        }
        print(arr);
        addmultiply(arr);
        print(arr);

    }
    public static  void addmultiply(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            if(i%2==0) {
                arr[i]+=10;
            }
            else arr[i]*=2;
        }
    }
    public static void print(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
}
