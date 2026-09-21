package Strings;

public class Substringofstring {
    public static void main(String[] args) {
        String S="anisha";
       printAllSubstring(S);
    }

    private static void printAllSubstring(String s) {
        int n=s.length();
        for (int i = 0; i <=n ; i++) {
            for (int j = i; j <=n ; j++) {
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }

    }
}
