package oops;

import java.sql.SQLOutput;

public class cunstructor {
    public static class Studentmarks{
        String name;
        int roll;
        int[] marks;
//        Studentmarks(String p,int x){
//            name=p;
//            roll=x;
//        }
        Studentmarks(int marks){
           this.marks=new int[marks];//this is used to solve conflict.
        }
//        Studentmarks(int[] x){
//            marks=x;
//        }
    }
    public static void main(String[] args) {
//        Studentmarks s1=new Studentmarks("suraj",67,23);
//        System.out.println(s1.marks);
        Studentmarks s1=new Studentmarks(2);
        s1.marks[0]=1;
         s1.marks[1]=2;
        System.out.println(s1.marks[1]);
//        int[] arr={0,1};
//         Studentmarks s1=new Studentmarks(arr);
//


        }
    }

