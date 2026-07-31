package patternprinting;

import java.util.Scanner;

public class Alphabetsquare {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of alphabet  :-");
        int n = sc.nextInt();
        if (n <= 26) {
            for (int i = 65; i < n + 65; i++) {
                for (int j = 65; j < n + 65; j++) {
                    System.out.print((char) j + " ");
                }
                System.out.println();
            }
        }
        else System.out.println("invalid alphabet:you can't have more then 26 and less then 1 alphabet ");
    }
}
