package oops;
class Cricketer{
    int runs;
    String name;
    double Strikerate;
    final String country="india";
    static String profession="cricket";
    void print(){
        System.out.println(name+" "+runs+" "+Strikerate+" "+country+" "+profession);
    }
    Cricketer(String x,int a,double b){
        name=x;
        runs=a;
        Strikerate=b;
    }
    Cricketer(){

    }
}
public class Finalstastic {
    static void main(String[] args) {
        Cricketer s1 =new Cricketer("Rohit",20000,154.7);
        s1.print();
        s1.profession="Hockey";
        Cricketer s2= new Cricketer("virat",180000,157.5);
        s2.print();
       s2.profession="tennis";
        s2.print();


    }
}
