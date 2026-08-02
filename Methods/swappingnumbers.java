package Methods;

public class swappingnumbers {
    static void main(String[] args) {
        int x=4,y=6;
        Swap(x,y);
//        System.out.println("a is :-"+x);
//        System.out.println("b is :-"+y);

    }
    public static void Swap(int x,int y){
        int temp=x;
        x=y;
        y=temp;
        System.out.println(x+" "+y);
    }
}
