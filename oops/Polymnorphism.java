package oops;

public class Polymnorphism {
    public static  class Dog{
        void speak(){
            System.out.println("bhau bhau");
        }
    }
    public static  class cat{
        void speak(){
            System.out.println("meow-meow");
        }
    }
    public static  class tiger{
        void speak(){
            System.out.println("grrrr");
        }
    }
    public static void main(String[] args) {
Dog s1=new Dog();
cat s2=new cat();
tiger s3=new tiger();
s1.speak();
s2.speak();
s3.speak();
    }
}
