package arraylists;

import java.util.Collections;
import java.util.Vector;

public class addingtwo {
   public static  Vector<Integer> addOne(int[] arr) {
        int n=arr.length;
        int carry=1;
        int sum=2;
        Vector<Integer> arr2 = new Vector<>();
        for(int i=n-1;i>=0;i--){
            if((arr[i]+sum)<=9){
                arr2.add(arr[i]+sum);
                sum=0;
            }
            else if((arr[i])+sum==10){
                arr2.add(0);
                sum=1;
            }
            else{
                arr2.add(1);
             sum=1;
            }
        }
        if(sum==1) arr2.add(1);
        Collections.reverse(arr2);
        return arr2;
    }

    public static void main(String[] args) {
        int[] arr={9,9,9};
        Vector<Integer> arr3=addOne(arr);
        System.out.println(arr3);
    }
}
