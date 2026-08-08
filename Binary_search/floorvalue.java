package Binary_search;

public class floorvalue {
    public static int findFloor(int[] arr, int x) {
        int n=arr.length;
        int low=0;
        int indx=-1;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;

            if((arr[mid]<=x)){
                indx=mid;
                low=mid+1;
            }
            else if (arr[mid]>x){
                high=mid-1;
            }
        }
        return indx;
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        int target=7;
        System.out.println(findFloor(arr,target));


    }
}
