package java_basics;
import java.sql.SQLOutput;
import java.util.Scanner;
public class takinginput {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        double r =as.nextDouble();
        double areaofCircle=3.14*r*r;
        System.out.println("area of circle :-"+areaofCircle);
        double xs =as.nextDouble();
        double area = xs*r;
        System.out.println("area of rectangle:-"+area);
        double h = as.nextDouble();
        double cuoboidarea= xs*h*r;
        System.out.println("area of cuboid:-"+cuoboidarea);
            }
}
