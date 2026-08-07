package basic_sorting_Algorithms;

public class movezeroes {
    public static void main(String[] args) {
        int[] arr={1,0,2,0,-3,0,5};
        int n=arr.length;
        print(arr);
        System.out.println();
        for (int i = 0; i <n-1 ; i++) {
            int swap=0;
            for (int j = 0; j <n-1-i ; j++) {
                if(arr[j]==0||arr[j+1]>0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0) break;
        }
        print(arr);
    }
    public static void print(int[] arr){
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
