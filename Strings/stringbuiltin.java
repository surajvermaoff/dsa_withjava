package Strings;

public class stringbuiltin {
public static void main(String[] args) {
    String s = "nitishku";
    System.out.println(s.indexOf(s));
    System.out.println(s.toUpperCase());
    System.out.println(s.toLowerCase());
    System.out.println(s.contains("ur"));
    String str="nitish";
    System.out.println(CompareTO(s,str));
}

    private static int CompareTO(String s, String str) {
    int dif=0;
    int n=s.length();
    int m=str.length();
    int i=0;
    while(i<n&&i<m){
        int ch=(int)s.charAt(i);
        int mh=(int)str.charAt(i);
        if(ch==mh){
            i++;
        }
        else{
           return  dif=ch-mh;
        }
    }
    if(i<n) {
        for (int j = i; j < n; j++) {
            dif++;
        }
    }
         else if(i<m){
        for (int j = i; j <n ; j++) {
            dif++;
        }
    }

    return  dif;
    }

}
