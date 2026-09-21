package Strings;

public class reversestring {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder(10);
        sb.append("suraj");
        int n=sb.length();
        int i=0;
        int j=n-1;
        sb.reverse();
        System.out.println(sb);
        while (i<j) {
            char temp1= sb.charAt(i);
            char temp2=sb.charAt(j);
            sb.setCharAt(i,temp2);
            sb.setCharAt(j,temp1);
            i++;
            j--;
        }
        System.out.println(sb);
    }
}
