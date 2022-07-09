package InsertionSort;

import java.util.Arrays;

public class Q1_InsertionSort {
    public static void main(String[] args) {
        int[] a = {5, -4, 3, 0, 9, 1, -10};
        System.out.println(Arrays.toString(a));
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }

    static void insertionSort(int[] a){
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j > 0 ; j--) {
                if(a[j] < a[j-1]){
                    swap(a,j,j-1);
                }else {
                    break;
                }
            }
        }
    }

    static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

}
