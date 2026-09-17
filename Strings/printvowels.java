package Strings;

import java.util.Scanner;

public class printvowels {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter string:-");
        String s=sc.nextLine();
        System.out.println("the number of vowels are:-"+Countvowels(s));
    }

    public static int Countvowels(String s) { //n
        int n=s.length();
        int count=0;
        for (int i = 0; i <n ; i++) {
            int ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }

        }

        return  count;
    }
//    public static int Countvowels(String str){//n2
//        int n=str.length();
//        String vow="aeiou";
//        int count=0;
//        int m=vow.length();
//        for (int i = 0; i <n ; i++) {
//            for (int j = 0; j <m ; j++) {
//                if(str.charAt(i)==vow.charAt(j)){
//                    count++;
//                }
//            }
//
//
//
//        }
//        return count;
//    }
}


