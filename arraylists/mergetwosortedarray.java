package arraylists;

public class mergetwosortedarray {
    public static void mergetwo(int[] a,int[] b,int[] c){

        int i=0,j=0,k=0;
        while((i<a.length) && (j<b.length)){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
                k++;
            }
            else {
                c[k]=b[j];
                j++;
                k++;
            }

        }

            while(j<b.length) {
                c[k] = b[j];
                k++;
                j++;
            }


            while (i<a.length) {
                c[k] = a[i];
                i++;
                k++;

        }
    }

    public static void main(String[] args) {
        int[] a={1,3,7,8,9,};
        int[] b={2,4,5,8};
        int n=a.length+b.length;
        int[] c= new int[n];
        for(int ele:c){
            System.out.print(ele+" ");
        }
        System.out.println();
        mergetwo(a,b,c);
        for(int x: c){
            System.out.print(x+" ");
        }
    }

}
