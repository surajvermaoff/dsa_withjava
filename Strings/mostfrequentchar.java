package Strings;

import java.util.Arrays;

public class mostfrequentchar {
    public static void main(String[] args) {
        String s = "abacusand";
        System.out.println(mosfreq(s));
    }

    private static char mosfreq(String s) {

//        char ans=s.charAt(0);
//        char[] arr=s.toCharArray();
//        Arrays.sort(arr);
//        int n=arr.length;
//        int mostfreq=-1;
//        int i=0;
//        int j=0;
//        while(j<n){
//            if(arr[i]==arr[j]) j++;
//            else{
//                int freq=j-i;
//               if(freq>mostfreq){
//                   mostfreq=freq;
//                   ans=arr[i];
//               }
//               i=j;
//            }
//
//        }
//        int freq=j-i;
//        if(freq>mostfreq){
//            mostfreq=freq;
//            ans=arr[i];
//        }
//
//        return ans;
        int n = s.length();
        int[] arr = new int[26];
        int maxfreq = 0;
        char ans = s.charAt(0);
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int idx = ch - 97;
            arr[idx]++;
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > maxfreq) {
                maxfreq = arr[j];
                ans = (char) (j + 97);
            }
        }
return ans;
    }


}
