package Methods;

public class returntype {
    public static double nancy(double a){
        System.out.println("nancy loves ankit");
        if(a>0.0) return a;
        else return 5.0;
    }

    public static void main(String[] args) {
        double x = nancy(6);
        System.out.println(x+10);

    }
}
