package arraylists;

import java.util.Collections;
import java.util.Vector;

public class addingtwonumberarrays {
      public static Vector<Integer> addtwoarray(int[] a,int[] b ){
          Vector<Integer> arr=new Vector<>();
          int n=a.length;
          int m=b.length;
          int i=n-1,j=m-1;
          int carry=0;
          while (i>=0&&j>=0){
              if(a[i]+b[j]+carry<=9){
                  arr.add(a[i]+b[j]+carry);
                  carry=0;
              }
              else {
                  arr.add((a[i]+b[j]+carry)%10);
                  carry=1;
              }
              i--;
              j--;
          }
          while(i>=0){
              if(a[i]+carry<=9){
                  arr.add(a[i]);
              }
              else {
                  arr.add((a[i] + carry) % 10);
                  carry = 1;
              }
              i--;
          }
          while(j>=0) {
              if (a[j] + carry <= 9) {
                  arr.add(b[j]);
              } else {
                  arr.add((b[j] + carry) % 10);
                  carry = 1;
              }
              j--;
          }
          if(carry==1) arr.add(1);
          Collections.reverse(arr);
          return arr;
      }

    public static void main(String[] args) {
        int[] a={9,9,9};
        int[] b={3,4,8};
        Vector<Integer> ans=addtwoarray(a,b);
        System.out.println(ans);
    }
}
