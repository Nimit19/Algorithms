package BubbleSort;

import java.util.Arrays;

public class BubbleSortWithRecursion {
    public static void main(String[] args) {

        int[] a = {-25,0,56,-42,96,-29,38};

        System.out.println(Arrays.toString(a));
        int start= 0;
        int end  = a.length - 1;
        bubbleSort(a,start,end);
        System.out.println(Arrays.toString(a));
    }
    static void bubbleSort(int[] a,int start,int end){
        if(end == 0)
            return;


        if(start < end){
            if(a[start] > a[start + 1]){
                int temp = a[start + 1];
                a[start + 1] = a[start];
                a[start] = temp;
            }
            bubbleSort(a,start + 1 ,end);
        } else {
            bubbleSort(a,0 ,end - 1);
        }

    }
}
