package arrays;

public class segregate0s1s {
   public static void segregate0and1(int[] arr) {
        int zeroes=0;
        int ones=0;
        for(int num:arr){
            if(num==0){
                zeroes++;
            }
            else ones++;
        }
        for(int i=0;i<arr.length;i++){
            if(i<zeroes) arr[i]=0;
            else arr[i]=1;
        }
    }
    public static void main(String[] args) {
        int arr[] ={1,0,1,0};
        segregate0and1(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
