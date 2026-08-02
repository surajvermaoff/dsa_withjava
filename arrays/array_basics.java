package arrays;

public class array_basics {
    public static void main(String[] args) {
        int[] a={2,4,6,8,10,12,14};//array initialisation + declaration
        //indexing
        System.out.println(a[0]);//access
        System.out.println(a[6]);
        //updating elements-mutability
        a[3]=18;
        System.out.println(a[3]);
        //initialising an empty array
        int[] arr = new int[6];//size is important.
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        arr[5]=60;


    }
}
