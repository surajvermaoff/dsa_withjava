package arraylists;

import java.util.ArrayList;
import java.util.Arrays;

public class coomonelements {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        Arrays.sort(a);
        Arrays.sort(b);

        ArrayList<Integer> arr = new ArrayList<>();
        int n=a.length;
        int m=b.length;
        int i=0;
        int j=0;
        while(i<a.length&&j<b.length){
            if(a[i]==b[j]){
                arr.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else{
                j++;
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] x={2,6,7,4};
        int[] y={2,6,4,3};
        ArrayList<Integer> arr=commonElements(x,y);
        System.out.println(arr);
    }
}
