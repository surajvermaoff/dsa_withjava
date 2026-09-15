package oops;
class Fraction{
    int x;
    int y;



    void simplify(){
        boolean isnegative=(x*y<0)?true:false;
        x=Math.abs(x);
        y=Math.abs(y);
        int fr=hcf(x,y);
        x=x/fr;
        y=y/fr;
        if(isnegative) x=-x;
    }

    Fraction(int x,int y){
        this.x=x;
        this.y=y;
        simplify();
    }
    void print(){
        System.out.println(x+"/"+y);
    }

     void add(Fraction x2) {
        this.x=(x*x2.y)+(y*x2.x);
        this.y=y*x2.y;
        simplify();
    }
 void subtract(Fraction x2) {
        this.x=(x*x2.y)-(y*x2.x);
        this.y=y*x2.y;
        simplify();
    }

     void multiply(Fraction x2) {
        x*=x2.x;
        y*=x2.y;
        simplify();
    }
//

     int hcf(int a, int b) {
        if(a==0) return b;
        return  hcf(b%a,a);

    }
}
public class fractionclass {
    public static void main(String[] args) {
        Fraction x1= new Fraction(2,4);
        x1.print();
        Fraction x2= new Fraction(3,5);
        x2.print();x1.add(x2);
        x1.print();;
        x1.subtract(x2);
        x1.print();
        x1.multiply(x2);
        Fraction f3=new Fraction(50,-100);
        f3.print();
    }
}
