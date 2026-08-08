package basic_sorting_Algorithms;

public class insertionsort {
    public static void main(String[] args) {
        int[] arr= {2,1,3,4,9,8,5,6};
        int n=arr.length;
        for (int i = 1; i <n ; i++) {
            int j=i;

                while(j>0&&arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    j--;

            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
