package arrays;

public class missingelement {
   public static int missingNum(int arr[]) {
        long n=arr.length+1;
        long sum=(n*(n+1))/2;
        long arraysum=0;
        for(int i=0;i<arr.length;i++){
            arraysum+=arr[i];
        }
        return (int)(sum-arraysum);
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,4,6};
        System.out.println("missing element is "+missingNum(arr));
    }
}
