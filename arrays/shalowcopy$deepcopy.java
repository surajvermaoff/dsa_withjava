package arrays;

import java.util.Arrays;

public class shalowcopy$deepcopy {
    public static void main(String[] args) {
        int[] arr={2,7,9,6};
int[] x=arr;//x is a shallow copy of arr
x[2]=5;

        int[] y= Arrays.copyOf(arr,arr.length);//y is deep copy of arr
        y[2]=10;
        System.out.println(arr[2]);
        System.out.println(y[2]);
    }

}
