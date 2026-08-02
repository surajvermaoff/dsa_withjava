package Methods;

public class passbyvaluepassbyreference {
    public static void main(String[] args) {
        int x=6;
        System.out.println(x);
        nitish(x);
        System.out.println(x);
    }
    public static void nitish(int x){
        x=10;
    }
}
