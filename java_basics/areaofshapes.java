package java_basics;

import java.sql.SQLOutput;

public class areaofshapes {
    public static void main(String[] args) {
        double r=10,area=3.14*r*r;//;area of circle
        System.out.println(area);
//        area = 4/3 *3.14*Math.pow(r,3);
        area = 4/3 *3.14*r*r*r;//volume of sphere
        System.out.println(area);
    }
}
