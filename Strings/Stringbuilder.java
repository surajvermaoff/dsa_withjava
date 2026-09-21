package Strings;
public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder(8);
        sb.append("suraj");
        sb.setCharAt(1,'u');
        System.out.println(sb.length()+" "+ sb.capacity());
        System.out.println(sb);

    }
}
