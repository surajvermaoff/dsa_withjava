package arrays;

public class rotatedarray {
    public static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n;
        rotatearray(arr, 0, d - 1);
        rotatearray(arr, d, n - 1);
        rotatearray(arr, 0, n - 1);
    }

    public static void rotatearray(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10,9};
        int d=4;
        rotateArr(arr,d);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

