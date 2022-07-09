package SelectionSort;

import java.util.Arrays;

public class Q1_SelectionSort {
    public static void main(String[] args) {

        int[] a = {5, -4, 3, 0, 9, 1, -10};
        System.out.println(Arrays.toString(a));
        selectionSort(a);
        System.out.println(Arrays.toString(a));

    }

    static void selectionSort(int[] a){

        for (int i = 0; i < a.length; i++) {

            int last = a.length - i - 1;
            int maxIndex = maxValue(a,0,last);

            swap(a,last,maxIndex);
        }

    }

    static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    // it' work for the index
    // return the index value of maximum element
    static int maxValue(int[] a, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if(a[i] > a[max]){
                max = i;
            }
        }

        return max;
    }
}
