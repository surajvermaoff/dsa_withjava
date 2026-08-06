package arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arraylistsyntax {
    static void main(String[] args) {
        ArrayList<Integer>  arr= new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr.get(2));
        arr.set(3,6);
        System.out.println(arr.get(3));
        System.out.println(arr);
        for (int i = 0; i <arr.size() ; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
            for(int ele:arr){
                System.out.print(ele+" ");

        }
        Collections.reverse(arr);
    }
}
