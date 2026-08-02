package arrays;

import java.util.Scanner;

public class input$output {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr= {1,2,3,4,5,6,7,};
        int i=0;
//        while(i<=6)
//       {
//            System.out.println("arr"+i+" "+arr[i]);
//            i++;
//        }
//    while(i<arr.length){
//        System.out.println("arr"+i+" "+arr[i]);
//        i++;
//    }
        int[] arr2 = new int[7];
        for (int j = 0; j <arr2.length ; j++) {
//            arr2[j]=sc.nextInt();
            int x= sc.nextInt();
            arr2[j]=x;
        }
        for (int k = 0; k <arr2.length ; k++) {
            System.out.print(arr2[k]+" ");

        }
    }

}
