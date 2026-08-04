package arrays;
import java.util.Arrays;
public class arraysortbuiltin {
    public static void main(String[] args) {
        int[] arr ={6,2,8,-1,4};
        print(arr);
        Arrays.sort(arr);
        print(arr);

    }
    public static void print(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
}
