package if_else;
import java.util.Scanner;
public class profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the cost price : ");
        double cp = sc.nextDouble();
        System.out.print("enter the selling price : ");
        double sp = sc.nextDouble();
        if (cp==sp) System.out.println("no profit no loss");
        else if (sp>cp) {
            double pr = sp-cp ;
            System.out.println("he made profit :"+pr);
            System.out.println("profit in percentage :"+(pr/cp*100)+"%");
        }
        else {
            double ls = cp-sp;
            System.out.println("he made loss of :"+ls);
            System.out.println("loss in percentage :"+(ls/cp*100)+"%");
            sc.close();
        }
    }
}
