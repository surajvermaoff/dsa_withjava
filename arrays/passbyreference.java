package arrays;

public class passbyreference {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        System.out.println(arr[2]);
        changes(arr);
        System.out.println(arr[2]);

    }
    public static void changes(int[] x){
        x[2]=-6;
    }
}
