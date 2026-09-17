package Strings;

public class pallindrome {
    public static void main(String[] args) {
        String s="abjvcba";
        System.out.println(IsPallindrome(s));

    }
    public static boolean IsPallindrome(String x){
        boolean flag=true;
        int n=x.length();
        int i=0;
        int j=n-1;
        while(i<=j){
            if(x.charAt(i)==x.charAt(j)){
                j--;
                i++;
            }
            else{
                flag=false;
                break;
            }
        }

        return flag;
    }
}
