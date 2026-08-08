package Binary_search;

public class smallestelementsearch {
    public static int firstSearch(int[] arr, int k) {
        int n=arr.length;
        int low=0;
        int indx=-1;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k){
                indx=mid;
                high=mid-1;
            }
            else if(arr[mid]>k){
                high=mid-1;
            }
            else low=mid+1;
        }
        return indx;
    }
    public static void main(String[] args) {
        int[] arr ={2,4,6,8,9};
        int target=10;
        System.out.println(firstSearch(arr,target));
    }
}
