package oops;
class ComplexNumber{
    int x;
    int y;
    String c="i"+y;
    void print(){
      if(y>=0)  System.out.println(x+"+"+y+"i");
      else System.out.println(x+"-"+(-y)+"i");

    }
    ComplexNumber(int x,int y){
        this.x=x;
        this.y=y;
    }

     void add(ComplexNumber s) {
    this.x+=s.x;
    this.y+=s.y;
    }
     void multiply(ComplexNumber s) {
    x=(s.x*x)-(s.y*y);
    y=(x*s.y) + (y*s.x);
    }
}
public class classcomplex {
    public static void main(String[] args) {
        ComplexNumber s1= new ComplexNumber(2,-5);
        ComplexNumber s2= new ComplexNumber(3,4);
        s1.add(s2);
        s1.print();
        s2.print();
        s2.multiply(s1);
        s2.print();
    }
}
