package arrays;

public class twosum {
    public static void main(String[] args) {
        int[] arr={2,4,6,8};
        int target=10;
        System.out.println(sum(arr,target));

    }
    public static boolean sum(int[] arr,int target){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]+arr[j]==target){
                    return true;
                }

            }
        }
        return false;
    }
}
