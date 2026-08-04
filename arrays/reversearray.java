package arrays;

public class reversearray {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,};
        int i=0;
        int n= arr.length;
        int j=n-1;
        int temp;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele:arr){
            System.out.print(" "+ele);
        }
    }
}
