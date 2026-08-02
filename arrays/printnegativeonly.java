package arrays;

public class printnegativeonly {
    static void main(String[] args) {
        int[] arr= {1,2,4,6,-7,-8,9,-10};
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<0) {
                System.out.println(arr[i]);
            }

        }
    }
}
