package Binary_search;

import java.util.ArrayList;

public class frstandlasttarget {
    public static ArrayList<Integer> find(int arr[], int x) {

        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();

        int low = 0;
        int high = n - 1;

        int indx1 = -1;
        int indx2 = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == x) {

                indx1 = mid;
                indx2 = mid;

                // Find first occurrence
                int i = mid - 1;

                while (i >= 0 && arr[i] == x) {
                    indx1 = i;
                    i--;
                }

                // Find last occurrence
                int j = mid + 1;

                while (j < n && arr[j] == x) {
                    indx2 = j;
                    j++;
                }

                break;
            }

            else if (arr[mid] > x) {
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }

        list.add(indx1);
        list.add(indx2);

        return list;
}
    public static void main(String[] args) {
        int[] arr ={2,4,6,6,6,8,9};
        int target=6;
      ArrayList<Integer> a2=find(arr,target);
        System.out.println(a2);
    }
}

