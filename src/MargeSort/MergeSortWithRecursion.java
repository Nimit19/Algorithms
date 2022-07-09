package MargeSort;

import java.util.Arrays;

public class MergeSortWithRecursion {
    public static void main(String[] args) {
        int[] a = {5, -4, 3, 0, 9, 1, -10};
        System.out.println(Arrays.toString(a));
        int[] a2 = mergrSort(a);
        System.out.println(Arrays.toString(a2));
    }

    static int[] mergrSort(int[] a){
        if (a.length == 1)
            return a;

        int mid = a.length/2;

        int[] left = mergrSort(Arrays.copyOfRange(a,0,mid));
        int[] right = mergrSort(Arrays.copyOfRange(a,mid,a.length));

        return merge(left,right);
    }

   static int[] merge(int[] left, int[] right) {
        int[] mix = new int[right.length + left.length];

        int l = 0;
        int r = 0;
        int m = 0;

        while (r < right.length && l < left.length ){
            if(right[r] < left[l]){
                mix[m] = right[r];
                m++;
                r++;
            }else {
                mix[m] = left[l];
                m++;
                l++;
            }
        }

        while(r < right.length ){
            mix[m] = right[r];
            m++;
            r++;
        }

       while(l < left.length ){
           mix[m] = left[l];
           m++;
           l++;
       }

        return mix;
    }
}
