package MargeSort;

import java.util.Arrays;

public class MergeSortWithRecursion_02 {
    public static void main(String[] args) {
        int[] a = {5, -4, 3, 0, 9, 1, -10,-38};

        System.out.println(Arrays.toString(a));
        mergeSort(a,0,a.length );
        System.out.println(Arrays.toString(a));
    }

    static void mergeSort(int[] a,int start,int end){
        if (end - start == 1)
            return;

        int mid = (start + end )/2;

        mergeSort(a,start,mid);
        mergeSort(a,mid,end);

        merge(a,start,mid,end);
    }

    static void merge(int[] a,int start,int mid,int end) {
        int[] mix = new int[end - start];

        int l = start;
        int r = mid;
        int m = 0;

        while (l < mid && r < end){
            if(a[l] < a[r]){
                mix[m] = a[l];
                l++;
            }else {
                mix[m] = a[r];
                r++;
            }
            m++;
        }

        while(r < end){
            mix[m] = a[r];
            m++;
            r++;
        }

        while(l < mid){
            mix[m] = a[l];
            m++;
            l++;
        }

        for (int i = 0; i < mix.length ; i++) {
            a[start + i] = mix[i];
        }


    }

}
