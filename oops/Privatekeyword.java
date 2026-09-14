package oops;
class Nitish{
    String name;
    private int rno;
     String hometown;

    void setrno(int x){
        rno =x;
    }
    void getrno(){
        System.out.println(rno);
    }
}

public class Privatekeyword {
    static void main(String[] args) {
        Nitish s1= new Nitish();
     s1.name="nitish";
     s1.hometown="dhanbad";
     s1.setrno(45);
        System.out.println(s1.name+" "+s1.hometown+" ");
        s1.getrno();
        s1.setrno(56);
        s1.getrno();
    }
}
