package SelectionSort;

import java.util.Arrays;

public class SelectionSortWithRecursion {
    public static void main(String[] args) {

        int[] a = {5, -4, 3, 0, 9, 1, -10};
        System.out.println(Arrays.toString(a));

        int start= 0;
        int end  = a.length - 1;
        selectionSort(a,start,end,0);

        System.out.println(Arrays.toString(a));

    }

    static void selectionSort(int[] a,int start,int end,int max){

        if(end == 0)
            return;

        if(start < end){
            if(a[start] > a[max]){
                selectionSort(a,start + 1,end,start);
            }else {
                selectionSort(a,start + 1,end,max);
            }

        }else{
            int temp = a[max];
            a[max] = a[end];
            a[end] = temp;
            selectionSort(a,0,end - 1,0);
        }

    }
}

