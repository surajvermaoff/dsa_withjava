package java_basics;

public class TypeCasting {
    static void main(String[] args) {
        char ch ='x';
        int b = ch;//implicit
        System.out.println(b);
         ch = '0';
        int c = (int)ch;//explicit
        System.out.println(c);
        System.out.println(ch+0);
        System.out.println(ch*ch);
        int y = 101;
        char d = (char)y;
        System.out.println(d);

    }
}

