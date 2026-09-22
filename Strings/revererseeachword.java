package Strings;

import java.util.Arrays;

public class revererseeachword {
    public static void main(String[] args) {
        String s = "nitish is an   idiot";

        System.out.println(reversedsentence(s));
    }

    private static String reversedsentence(String s) {

        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(' ');
        StringBuilder finalsb = new StringBuilder();
        int n = sb.length();
        int i = 0, j = 0;
        if (sb.charAt(i) == ' ') i++;
        j++;
        while (j < n) {
            if (sb.charAt(j) != ' ') j++;
            else {
              if(i<j){
                  String sn = s.substring(i, j);
                  finalsb.append(reverseword(sn));
                  finalsb.append(' ');
              }

                j++;
                i=j;
            }



        }
        return finalsb.toString().trim();

    }
    public static String reverseword(String sn) {
        char[] arr=sn.toCharArray();
        int n= arr.length;;
        int i=0,j=n-1;
        while(i<=j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return new String(arr);

    }

}


