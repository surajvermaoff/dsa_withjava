package Methods;

public class arguments {
public static void sum(int a ,int b){//parameters
    System.out.println(a+b);
}

    public static void main(String[] args) {
        sum(2,3);//arguments
        max(2,5,9);
    }
    public static void max(int a,int b,int c){
    if(a>b&&b>c) System.out.println(a);
    else if (b>a&&a>c) {
        System.out.println(b);
    }
    else System.out.println(c);
    }
}
