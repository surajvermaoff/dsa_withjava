package oops;

import java.util.ArrayList;

class Arraylist1{
    int[] arr;
   int idx=0;
   int size=0;

Arraylist1(int capacity){
    arr=new int[capacity];
}

     void add(int ele) {
    if(idx==arr.length){
        capacityincrease();
    }
      arr[idx++]=ele;
      size++;
    }

    private void capacityincrease() {
    int[] arr2=new int[2*arr.length];
        for (int i = 0; i <arr.length ; i++) {
            arr2[i]=arr[i];
        }
        arr=arr2;

    }

    void display(){
        for (int i = 0; i <size ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

     void removefromend() {
        size--;
        idx--;
            }

     void get(int index) {
         System.out.println(arr[index]);
    }

     void set(int index, int element) {
    arr[index]=element;
    }

     void remove(int indx) {
         for (int i = indx; i <size-1; i++) {
                 arr[i]=arr[i+1];
         }
         size--;
         idx--;
    }

    public void insert(int indx, int ele) {
         int[] arr3=new int[arr.length+1];
        for (int i = 0; i <arr3.length ; i++) {
            if(i<indx){
                arr3[i]=arr[i];
            } else if (i==indx) {
                arr3[i]=ele;
            }
            else{
                arr3[i]=arr[i-1];
            }
        }
      size++;
        idx++;
        arr=arr3;
    }
}
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr2=new ArrayList();
      Arraylist1 arr=new Arraylist1(2);
      arr.add(20);
      arr.add(30);
      arr.display();
      arr.add(50);
      arr.display();
      arr.removefromend();
      arr.display();
      arr.get(1);
      arr.set(1,70);
      arr.get(1);
      arr.display();
      arr.add(76);
      arr.add(98);
      arr.display();
     arr.remove(2);
     arr.display();
     arr.remove(1);
     arr.display();
     arr.insert(1,10);
     arr.display();
     arr.insert(0,7);
     arr.display();
     arr.add(89);
     arr.display();
     arr.remove(0);
     arr.display();


    }
}
