package Binary_search;

public class binarysearch {
   public static void search(int[] arr,int target) {
       int n=arr.length;
       int low=0;
       int high=n-1;
       while(low<=high){
           int mid=(low+high)/2;
           if(arr[mid]<target){
               low=mid+1;
           }
           else if(arr[mid]>target){
               high=mid-1;
           }
           else {
               target=mid;
           }
       }
       System.out.println(target);
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        int target=7;
        search(arr,target);

    }
}
