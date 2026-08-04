package arrays;

public class largestelementinarray {
    public static void main(String[] args) {
        int[] arr={2,4,6,12,8,10};
        int max =Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        int i =0;
        while(i<arr.length){
            if(arr[i]>max) {
                max=arr[i];
            } else if (arr[i]<min) {
                min = arr[i];
            }
            i++;
        }
        System.out.println("max is :-"+max);
        System.out.println("min is :-"+min);
    }

}
