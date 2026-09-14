package oops;

public class passingmethodsinclass {
    public static class Car{

        String name;
        int topspeed;
        int torque;
        int seats;
         void print(){
             System.out.println(topspeed+" "+torque+" "+seats+" "+name);
        }

    }
    public static void main(String[] args) {
        Car s1=new Car();
        s1.name="baleno";
        s1.seats=5;
        s1.torque=6;
        s1.topspeed=240;
        Car s2=new Car();
        s2.name="marcedes";
        s2.seats=5;
        s2.torque=8;
        s2.topspeed=340;
        s1.print();
        s2.print();

    }
}
