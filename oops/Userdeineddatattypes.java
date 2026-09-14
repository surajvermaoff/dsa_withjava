package oops;

import java.util.Scanner;

public class Userdeineddatattypes {
    public static class Student{
        String name;
        int roll ;
        double marks;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Student s1=new Student();
   s1.name="suraj";
   s1.roll= sc.nextInt();
   s1.marks=7.7;
   Student s2=new Student();
   s2.name="nitish";
   s2.roll=176;
   s2.marks=7.0;
   Student s3=new Student();
   s3.name="lala";
   s3.roll=198;
   s3.marks=7.2;
        System.out.println(s1.name+" "+s1.roll+" "+s1.marks);

    }
}
