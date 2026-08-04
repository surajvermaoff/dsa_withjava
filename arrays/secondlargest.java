package arrays;

public class secondlargest {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 6, 8};
        int n = arr.length;
        int largest = max(arr);
        System.out.println(largest);
        int seclargest=max2(arr,largest);
        System.out.println(seclargest);

    }

    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
     public static int max2(int[] arr,int largest) {

         int seclargest=Integer.MIN_VALUE;
         for (int i = 0; i <arr.length ; i++) {
             if(arr[i]>seclargest && arr[i]!=largest){
                 seclargest=arr[i];
             }
         }
         return seclargest;
    }

}


